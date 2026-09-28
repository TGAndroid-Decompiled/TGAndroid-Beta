package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f18241a;
    public final SavedMessagesController f18242b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f18241a = i10;
        this.f18242b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18241a) {
            case 0:
                this.f18242b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18242b);
                return;
            case 2:
                SavedMessagesController.h(this.f18242b);
                return;
            case 3:
                SavedMessagesController.j(this.f18242b);
                return;
            default:
                SavedMessagesController.b(this.f18242b);
                return;
        }
    }
}
