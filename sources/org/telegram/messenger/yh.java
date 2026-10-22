package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f20163a;
    public final SavedMessagesController f20164b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f20163a = i10;
        this.f20164b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f20163a) {
            case 0:
                this.f20164b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f20164b);
                return;
            case 2:
                SavedMessagesController.h(this.f20164b);
                return;
            case 3:
                SavedMessagesController.j(this.f20164b);
                return;
            default:
                SavedMessagesController.b(this.f20164b);
                return;
        }
    }
}
