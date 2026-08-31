package org.telegram.ui;
public final class df implements Runnable {
    public final int f36212a;
    public final xn f36213b;
    public final long f36214c;
    public final long d;

    public df(xn xnVar, long j10, long j11, int i10) {
        this.f36212a = i10;
        this.f36213b = xnVar;
        this.f36214c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36212a) {
            case 0:
                xn.o0(this.f36213b, this.f36214c, this.d);
                return;
            default:
                xn.k1(this.f36213b, this.f36214c, this.d);
                return;
        }
    }
}
