package org.telegram.messenger;
public final class zh implements Runnable {
    public final int f18099a;
    public final SavedMessagesController f18100b;

    public zh(SavedMessagesController savedMessagesController, int i10) {
        this.f18099a = i10;
        this.f18100b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18099a) {
            case 0:
                this.f18100b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18100b);
                return;
            case 2:
                SavedMessagesController.h(this.f18100b);
                return;
            case 3:
                SavedMessagesController.j(this.f18100b);
                return;
            default:
                SavedMessagesController.b(this.f18100b);
                return;
        }
    }
}
