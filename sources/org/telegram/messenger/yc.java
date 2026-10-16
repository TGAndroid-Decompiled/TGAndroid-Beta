package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f18790a;
    public final MessagesController f18791b;
    public final boolean f18792c;

    public yc(int i10, MessagesController messagesController, boolean z10) {
        this.f18790a = i10;
        this.f18791b = messagesController;
        this.f18792c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18790a) {
            case 0:
                this.f18791b.lambda$checkPromoInfo$163(this.f18792c);
                return;
            default:
                this.f18791b.lambda$removeFolderTemporarily$483(this.f18792c);
                return;
        }
    }
}
