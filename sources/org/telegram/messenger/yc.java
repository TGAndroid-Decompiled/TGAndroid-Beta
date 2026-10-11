package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f19898a;
    public final boolean[] f19899b;
    public final Runnable[] f19900c;

    public yc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19898a = i10;
        this.f19899b = zArr;
        this.f19900c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19898a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f19899b, this.f19900c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19899b, this.f19900c);
                return;
        }
    }
}
