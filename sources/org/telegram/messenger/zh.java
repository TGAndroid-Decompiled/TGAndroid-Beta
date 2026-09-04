package org.telegram.messenger;
public final class zh implements Runnable {
    public final int f19846a;
    public final SavedMessagesController f19847b;

    public zh(SavedMessagesController savedMessagesController, int i10) {
        this.f19846a = i10;
        this.f19847b = savedMessagesController;
    }

    @Override
    public final void run() {
        switch (this.f19846a) {
            case 0:
                this.f19847b.update();
                return;
            case 1:
                SavedMessagesController.k(this.f19847b);
                return;
            case 2:
                SavedMessagesController.h(this.f19847b);
                return;
            case 3:
                SavedMessagesController.j(this.f19847b);
                return;
            default:
                SavedMessagesController.b(this.f19847b);
                return;
        }
    }
}
