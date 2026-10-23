package org.telegram.messenger;
public final class zk implements Runnable {
    public final int f20336a;
    public final TranslateController f20337b;
    public final long f20338c;

    public zk(TranslateController translateController, long j10, int i10) {
        this.f20336a = i10;
        this.f20337b = translateController;
        this.f20338c = j10;
    }

    @Override
    public final void run() {
        switch (this.f20336a) {
            case 0:
                TranslateController.G(this.f20337b, this.f20338c);
                return;
            default:
                TranslateController.p(this.f20337b, this.f20338c);
                return;
        }
    }
}
