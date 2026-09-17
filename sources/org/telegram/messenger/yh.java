package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19790a;
    public final SavedMessagesController f19791b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19790a = i10;
        this.f19791b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19790a) {
            case 0:
                this.f19791b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19791b);
                return;
            case 2:
                SavedMessagesController.h(this.f19791b);
                return;
            case 3:
                SavedMessagesController.j(this.f19791b);
                return;
            default:
                SavedMessagesController.b(this.f19791b);
                return;
        }
    }
}
