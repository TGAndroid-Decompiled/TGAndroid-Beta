package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f20232a;
    public final SavedMessagesController f20233b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f20232a = i10;
        this.f20233b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f20232a) {
            case 0:
                this.f20233b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f20233b);
                return;
            case 2:
                SavedMessagesController.h(this.f20233b);
                return;
            case 3:
                SavedMessagesController.j(this.f20233b);
                return;
            default:
                SavedMessagesController.b(this.f20233b);
                return;
        }
    }
}
