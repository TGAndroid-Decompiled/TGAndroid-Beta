package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f17985a;
    public final SavedMessagesController f17986b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f17985a = i10;
        this.f17986b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f17985a) {
            case 0:
                this.f17986b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f17986b);
                return;
            case 2:
                SavedMessagesController.h(this.f17986b);
                return;
            case 3:
                SavedMessagesController.j(this.f17986b);
                return;
            default:
                SavedMessagesController.b(this.f17986b);
                return;
        }
    }
}
