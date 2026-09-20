package org.telegram.messenger;
public final class zh implements Runnable {
    public final int f18316a;
    public final SavedMessagesController f18317b;

    public zh(SavedMessagesController savedMessagesController, int i10) {
        this.f18316a = i10;
        this.f18317b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18316a) {
            case 0:
                this.f18317b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18317b);
                return;
            case 2:
                SavedMessagesController.h(this.f18317b);
                return;
            case 3:
                SavedMessagesController.j(this.f18317b);
                return;
            default:
                SavedMessagesController.b(this.f18317b);
                return;
        }
    }
}
