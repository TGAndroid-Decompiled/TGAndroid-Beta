package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f20269a;
    public final TranslateController f20270b;
    public final long f20271c;

    public zk(TranslateController translateController, long j10, int i10) {
        this.f20269a = i10;
        this.f20270b = translateController;
        this.f20271c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20269a) {
            case 0:
                TranslateController.G(this.f20270b, this.f20271c);
                return;
            default:
                TranslateController.p(this.f20270b, this.f20271c);
                return;
        }
    }
}
