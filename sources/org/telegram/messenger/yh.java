package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19939a;
    public final SavedMessagesController f19940b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19939a = i10;
        this.f19940b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19939a) {
            case 0:
                this.f19940b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19940b);
                return;
            case 2:
                SavedMessagesController.h(this.f19940b);
                return;
            case 3:
                SavedMessagesController.j(this.f19940b);
                return;
            default:
                SavedMessagesController.b(this.f19940b);
                return;
        }
    }
}
