package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f19903a;
    public final boolean[] f19904b;
    public final Runnable[] f19905c;

    public yc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19903a = i10;
        this.f19904b = zArr;
        this.f19905c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19903a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f19904b, this.f19905c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19904b, this.f19905c);
                return;
        }
    }
}
