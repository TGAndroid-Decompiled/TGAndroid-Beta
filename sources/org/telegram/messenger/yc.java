package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f21907a;
    public final boolean[] f21908b;
    public final Runnable[] f21909c;

    public yc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f21907a = i10;
        this.f21908b = zArr;
        this.f21909c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f21907a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$467(this.f21908b, this.f21909c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f21908b, this.f21909c);
                return;
        }
    }
}
