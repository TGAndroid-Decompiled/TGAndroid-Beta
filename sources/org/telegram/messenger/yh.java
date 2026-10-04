package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19932a;
    public final SavedMessagesController f19933b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19932a = i10;
        this.f19933b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19932a) {
            case 0:
                this.f19933b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19933b);
                return;
            case 2:
                SavedMessagesController.h(this.f19933b);
                return;
            case 3:
                SavedMessagesController.j(this.f19933b);
                return;
            default:
                SavedMessagesController.b(this.f19933b);
                return;
        }
    }
}
