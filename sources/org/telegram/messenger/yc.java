package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f19666a;
    public final MessagesController f19667b;
    public final boolean f19668c;

    public yc(int i10, MessagesController messagesController, boolean z10) {
        this.f19666a = i10;
        this.f19667b = messagesController;
        this.f19668c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19666a) {
            case 0:
                this.f19667b.lambda$checkPromoInfo$163(this.f19668c);
                return;
            default:
                this.f19667b.lambda$removeFolderTemporarily$483(this.f19668c);
                return;
        }
    }
}
