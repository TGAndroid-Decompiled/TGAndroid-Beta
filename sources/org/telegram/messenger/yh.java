package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f18242a;
    public final SavedMessagesController f18243b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f18242a = i10;
        this.f18243b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18242a) {
            case 0:
                this.f18243b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18243b);
                return;
            case 2:
                SavedMessagesController.h(this.f18243b);
                return;
            case 3:
                SavedMessagesController.j(this.f18243b);
                return;
            default:
                SavedMessagesController.b(this.f18243b);
                return;
        }
    }
}
