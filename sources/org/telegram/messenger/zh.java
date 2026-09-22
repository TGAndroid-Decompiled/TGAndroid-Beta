package org.telegram.messenger;
public final class zh implements Runnable {
    public final int f18331a;
    public final SavedMessagesController f18332b;

    public zh(SavedMessagesController savedMessagesController, int i10) {
        this.f18331a = i10;
        this.f18332b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18331a) {
            case 0:
                this.f18332b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18332b);
                return;
            case 2:
                SavedMessagesController.h(this.f18332b);
                return;
            case 3:
                SavedMessagesController.j(this.f18332b);
                return;
            default:
                SavedMessagesController.b(this.f18332b);
                return;
        }
    }
}
