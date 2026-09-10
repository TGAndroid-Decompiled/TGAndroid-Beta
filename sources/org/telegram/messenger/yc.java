package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f17053a;
    public final boolean[] f17054b;
    public final Runnable[] f17055c;

    public yc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f17053a = i10;
        this.f17054b = zArr;
        this.f17055c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f17053a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$461(this.f17054b, this.f17055c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f17054b, this.f17055c);
                return;
        }
    }
}
