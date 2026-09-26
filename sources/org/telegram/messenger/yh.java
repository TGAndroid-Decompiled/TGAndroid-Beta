package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f18240a;
    public final SavedMessagesController f18241b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f18240a = i10;
        this.f18241b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18240a) {
            case 0:
                this.f18241b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18241b);
                return;
            case 2:
                SavedMessagesController.h(this.f18241b);
                return;
            case 3:
                SavedMessagesController.j(this.f18241b);
                return;
            default:
                SavedMessagesController.b(this.f18241b);
                return;
        }
    }
}
