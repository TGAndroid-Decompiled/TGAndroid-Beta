package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f18234a;
    public final SavedMessagesController f18235b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f18234a = i10;
        this.f18235b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18234a) {
            case 0:
                this.f18235b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18235b);
                return;
            case 2:
                SavedMessagesController.h(this.f18235b);
                return;
            case 3:
                SavedMessagesController.j(this.f18235b);
                return;
            default:
                SavedMessagesController.b(this.f18235b);
                return;
        }
    }
}
