package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f20148a;
    public final MessagesController f20149b;
    public final boolean f20150c;

    public yc(int i10, MessagesController messagesController, boolean z10) {
        this.f20148a = i10;
        this.f20149b = messagesController;
        this.f20150c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20148a) {
            case 0:
                this.f20149b.lambda$checkPromoInfo$163(this.f20150c);
                return;
            default:
                this.f20149b.lambda$removeFolderTemporarily$483(this.f20150c);
                return;
        }
    }
}
