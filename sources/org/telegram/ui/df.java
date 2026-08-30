package org.telegram.ui;
public final class df implements Runnable {
    public final int f33617a;
    public final xn f33618b;
    public final long f33619c;
    public final long d;

    public df(xn xnVar, long j10, long j11, int i10) {
        this.f33617a = i10;
        this.f33618b = xnVar;
        this.f33619c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f33617a) {
            case 0:
                xn.o0(this.f33618b, this.f33619c, this.d);
                return;
            default:
                xn.k1(this.f33618b, this.f33619c, this.d);
                return;
        }
    }
}
