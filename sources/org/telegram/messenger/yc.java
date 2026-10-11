package org.telegram.messenger;
public final class yc implements Runnable {
    public final int f19934a;
    public final boolean[] f19935b;
    public final Runnable[] f19936c;

    public yc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f19934a = i10;
        this.f19935b = zArr;
        this.f19936c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f19934a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$464(this.f19935b, this.f19936c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f19935b, this.f19936c);
                return;
        }
    }
}
