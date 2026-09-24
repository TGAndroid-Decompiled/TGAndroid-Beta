package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f18226a;
    public final SavedMessagesController f18227b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f18226a = i10;
        this.f18227b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18226a) {
            case 0:
                this.f18227b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18227b);
                return;
            case 2:
                SavedMessagesController.h(this.f18227b);
                return;
            case 3:
                SavedMessagesController.j(this.f18227b);
                return;
            default:
                SavedMessagesController.b(this.f18227b);
                return;
        }
    }
}
