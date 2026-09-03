package org.telegram.ui;
public final class df implements Runnable {
    public final int f36177a;
    public final xn f36178b;
    public final long f36179c;
    public final long d;

    public df(xn xnVar, long j10, long j11, int i10) {
        this.f36177a = i10;
        this.f36178b = xnVar;
        this.f36179c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36177a) {
            case 0:
                xn.o0(this.f36178b, this.f36179c, this.d);
                return;
            default:
                xn.k1(this.f36178b, this.f36179c, this.d);
                return;
        }
    }
}
