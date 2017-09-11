package assignment4;
//package : Package is name that organizes a set of related classes and interfaces similar to 
//different folders on my computer
public class Patternofabc {
//public : members which can access as public,public members are visible to all other classes.
//class : is a context of java that are used to create objects and to define object data types and methods.
	public static void main(String[] args) {
		//public : it can be called from anywhere.
		//static : doesn't belong to a specific object.
		//void : returns to no value.
		//main : is special because it will start the program.
		// TODO Auto-generated method stub
		int i=1;//int is a variable where we are using to intilize values.
		int j, d, x = 0;//here we are intilizing j,d and x is 0.
		char k;//char is a primitive type variable here we are using char to hold k value.
		while(i<=5){ //Here I'm using while loop to print the values in a rows
			k = 'a'; 
			for (j = 1, d=0; j <= 5; j++) { //Here I'm using for loop to print the values in  columns 
				// For increasing and decreasing the values I'm using nested if loop
				if (i < 4) {  // Starts increasing the values 
					if (j >= 4 - i && j <= 2 + i) {
						System.out.print(k);
						//system : is a class in java language pacakge.
						//out : static member of the system class.
						//println : to print what is output.
						if (j < 3) {
							k++;
						} else {//to test various conditions
							k--;
						}
					} else {//to test various conditions
						System.out.print(" ");
						//system : is a class in java language pacakge.
						//out : static member of the system class.
						//println : to print what is output.
					}
				} else {//to test various conditions
					
					// Starts decreasing values form here					
					if (j>i-3 && j <= 5-d) {
						
						System.out.print(k);
						//system : is a class in java language pacakge.
						//out : static member of the system class.
						//println : to print what is output.
						if (j<3) {
							k++;
						} else {//to test various conditions
							k--;
						}
					} else {//to test various conditions
						System.out.print(" ");
						//system : is a class in java language pacakge.
						//out : static member of the system class.
						//println : to print what is output.
						d++;
					}
				}

			}

			System.out.println();
			//system : is a class in java language pacakge.
			//out : static member of the system class.
			//println : to print what is output.
			i++;
		}
	}
}


