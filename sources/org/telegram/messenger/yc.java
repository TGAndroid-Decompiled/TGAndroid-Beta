package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f19665a;
    public final MessagesController f19666b;
    public final boolean f19667c;

    public yc(int i10, MessagesController messagesController, boolean z10) {
        this.f19665a = i10;
        this.f19666b = messagesController;
        this.f19667c = z10;
    }

    @Override
    public final void run() {
        switch (this.f19665a) {
            case 0:
                this.f19666b.lambda$checkPromoInfo$163(this.f19667c);
                return;
            default:
                this.f19666b.lambda$removeFolderTemporarily$483(this.f19667c);
                return;
        }
    }
}
