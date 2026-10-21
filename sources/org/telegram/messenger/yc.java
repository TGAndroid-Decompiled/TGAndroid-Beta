package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f20162a;
    public final boolean[] f20163b;
    public final Runnable[] f20164c;

    public yc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f20162a = i10;
        this.f20163b = zArr;
        this.f20164c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f20162a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f20163b, this.f20164c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f20163b, this.f20164c);
                return;
        }
    }
}
