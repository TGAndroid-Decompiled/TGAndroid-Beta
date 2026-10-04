package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19933a;
    public final SavedMessagesController f19934b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19933a = i10;
        this.f19934b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19933a) {
            case 0:
                this.f19934b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19934b);
                return;
            case 2:
                SavedMessagesController.h(this.f19934b);
                return;
            case 3:
                SavedMessagesController.j(this.f19934b);
                return;
            default:
                SavedMessagesController.b(this.f19934b);
                return;
        }
    }
}
