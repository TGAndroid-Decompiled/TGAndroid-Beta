package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19954a;
    public final SavedMessagesController f19955b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19954a = i10;
        this.f19955b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19954a) {
            case 0:
                this.f19955b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19955b);
                return;
            case 2:
                SavedMessagesController.h(this.f19955b);
                return;
            case 3:
                SavedMessagesController.j(this.f19955b);
                return;
            default:
                SavedMessagesController.b(this.f19955b);
                return;
        }
    }
}
