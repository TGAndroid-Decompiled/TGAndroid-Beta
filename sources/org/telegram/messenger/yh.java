package org.telegram.messenger;
public final class yh implements Runnable {
    public final int f19921a;
    public final SavedMessagesController f19922b;

    public yh(SavedMessagesController savedMessagesController, int i10) {
        this.f19921a = i10;
        this.f19922b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19921a) {
            case 0:
                this.f19922b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19922b);
                return;
            case 2:
                SavedMessagesController.h(this.f19922b);
                return;
            case 3:
                SavedMessagesController.j(this.f19922b);
                return;
            default:
                SavedMessagesController.b(this.f19922b);
                return;
        }
    }
}
