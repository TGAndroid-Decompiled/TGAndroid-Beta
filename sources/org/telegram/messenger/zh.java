package org.telegram.messenger;
public final class zh implements Runnable {
    public final int f18090a;
    public final SavedMessagesController f18091b;

    public zh(SavedMessagesController savedMessagesController, int i10) {
        this.f18090a = i10;
        this.f18091b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18090a) {
            case 0:
                this.f18091b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18091b);
                return;
            case 2:
                SavedMessagesController.h(this.f18091b);
                return;
            case 3:
                SavedMessagesController.j(this.f18091b);
                return;
            default:
                SavedMessagesController.b(this.f18091b);
                return;
        }
    }
}
