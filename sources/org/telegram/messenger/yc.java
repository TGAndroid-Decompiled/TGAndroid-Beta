package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f19907a;
    public final boolean[] f19908b;
    public final Runnable[] f19909c;

    public yc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19907a = i10;
        this.f19908b = zArr;
        this.f19909c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19907a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f19908b, this.f19909c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19908b, this.f19909c);
                return;
        }
    }
}
