package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f20217a;
    public final MessagesController f20218b;
    public final boolean f20219c;

    public yc(int i10, MessagesController messagesController, boolean z10) {
        this.f20217a = i10;
        this.f20218b = messagesController;
        this.f20219c = z10;
    }

    @Override
    public final void run() {
        switch (this.f20217a) {
            case 0:
                this.f20218b.lambda$checkPromoInfo$163(this.f20219c);
                return;
            default:
                this.f20218b.lambda$removeFolderTemporarily$483(this.f20219c);
                return;
        }
    }
}
