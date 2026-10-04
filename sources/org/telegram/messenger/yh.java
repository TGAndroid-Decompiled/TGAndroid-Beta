package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19934a;
    public final SavedMessagesController f19935b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19934a = i10;
        this.f19935b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19934a) {
            case 0:
                this.f19935b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19935b);
                return;
            case 2:
                SavedMessagesController.h(this.f19935b);
                return;
            case 3:
                SavedMessagesController.j(this.f19935b);
                return;
            default:
                SavedMessagesController.b(this.f19935b);
                return;
        }
    }
}
