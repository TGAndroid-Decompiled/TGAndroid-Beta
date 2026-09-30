package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f18258a;
    public final SavedMessagesController f18259b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f18258a = i10;
        this.f18259b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18258a) {
            case 0:
                this.f18259b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18259b);
                return;
            case 2:
                SavedMessagesController.h(this.f18259b);
                return;
            case 3:
                SavedMessagesController.j(this.f18259b);
                return;
            default:
                SavedMessagesController.b(this.f18259b);
                return;
        }
    }
}
