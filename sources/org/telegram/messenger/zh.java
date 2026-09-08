package org.telegram.messenger;
public final class zh implements Runnable {
    public final int f19873a;
    public final SavedMessagesController f19874b;

    public zh(SavedMessagesController savedMessagesController, int i10) {
        this.f19873a = i10;
        this.f19874b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19873a) {
            case 0:
                this.f19874b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19874b);
                return;
            case 2:
                SavedMessagesController.h(this.f19874b);
                return;
            case 3:
                SavedMessagesController.j(this.f19874b);
                return;
            default:
                SavedMessagesController.b(this.f19874b);
                return;
        }
    }
}
