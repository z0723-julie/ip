package duke;

public class DukeInvalidCommandException extends RuntimeException{
    DukeInvalidCommandException() {
        System.out.println("    ____________________________________________________________");
        System.out.println("     ☹ OOPS!!! I'm sorry, but I don't know what that means :-(");
        System.out.println("    ____________________________________________________________");
    }
}