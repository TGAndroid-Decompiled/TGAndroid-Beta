package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f20168a;
    public final boolean[] f20169b;
    public final Runnable[] f20170c;

    public yc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f20168a = i10;
        this.f20169b = zArr;
        this.f20170c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f20168a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f20169b, this.f20170c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f20169b, this.f20170c);
                return;
        }
    }
}
