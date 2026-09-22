package org.telegram.messenger;
public final class zh implements Runnable {
    public final int f18087a;
    public final SavedMessagesController f18088b;

    public zh(SavedMessagesController savedMessagesController, int i10) {
        this.f18087a = i10;
        this.f18088b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f18087a) {
            case 0:
                this.f18088b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f18088b);
                return;
            case 2:
                SavedMessagesController.h(this.f18088b);
                return;
            case 3:
                SavedMessagesController.j(this.f18088b);
                return;
            default:
                SavedMessagesController.b(this.f18088b);
                return;
        }
    }
}
