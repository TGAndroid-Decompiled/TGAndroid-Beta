package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f18243a;
    public final SavedMessagesController f18244b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f18243a = i10;
        this.f18244b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18243a) {
            case 0:
                this.f18244b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18244b);
                return;
            case 2:
                SavedMessagesController.h(this.f18244b);
                return;
            case 3:
                SavedMessagesController.j(this.f18244b);
                return;
            default:
                SavedMessagesController.b(this.f18244b);
                return;
        }
    }
}
