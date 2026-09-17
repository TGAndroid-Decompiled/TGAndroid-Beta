package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19763a;
    public final SavedMessagesController f19764b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19763a = i10;
        this.f19764b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19763a) {
            case 0:
                this.f19764b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19764b);
                return;
            case 2:
                SavedMessagesController.h(this.f19764b);
                return;
            case 3:
                SavedMessagesController.j(this.f19764b);
                return;
            default:
                SavedMessagesController.b(this.f19764b);
                return;
        }
    }
}
