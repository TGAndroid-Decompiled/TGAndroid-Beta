package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f19089a;
    public final MessagesController f19090b;
    public final boolean f19091c;

    public yc(int i10, MessagesController messagesController, boolean z10) {
        this.f19089a = i10;
        this.f19090b = messagesController;
        this.f19091c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19089a) {
            case 0:
                this.f19090b.lambda$checkPromoInfo$163(this.f19091c);
                return;
            default:
                this.f19090b.lambda$removeFolderTemporarily$483(this.f19091c);
                return;
        }
    }
}
