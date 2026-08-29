package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f22279a;
    public final SavedMessagesController f22280b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f22279a = i10;
        this.f22280b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f22279a) {
            case 0:
                this.f22280b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f22280b);
                return;
            case 2:
                SavedMessagesController.h(this.f22280b);
                return;
            case 3:
                SavedMessagesController.j(this.f22280b);
                return;
            default:
                SavedMessagesController.b(this.f22280b);
                return;
        }
    }
}
