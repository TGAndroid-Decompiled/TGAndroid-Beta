package org.telegram.messenger;
public final class zc implements Runnable {
    public final int f21989a;
    public final boolean[] f21990b;
    public final Runnable[] f21991c;

    public zc(boolean[] zArr, Runnable[] runnableArr, int i10) {
        this.f21989a = i10;
        this.f21990b = zArr;
        this.f21991c = runnableArr;
    }

    @Override
    public final void run() {
        switch (this.f21989a) {
            case 0:
                MessagesController.lambda$ensureMessagesLoaded$466(this.f21990b, this.f21991c);
                return;
            default:
                PasskeysController.lambda$login$12(this.f21990b, this.f21991c);
                return;
        }
    }
}
