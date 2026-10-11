package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19918a;
    public final SavedMessagesController f19919b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19918a = i10;
        this.f19919b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19918a) {
            case 0:
                this.f19919b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19919b);
                return;
            case 2:
                SavedMessagesController.h(this.f19919b);
                return;
            case 3:
                SavedMessagesController.j(this.f19919b);
                return;
            default:
                SavedMessagesController.b(this.f19919b);
                return;
        }
    }
}
