package org.telegram.ui;
public final class kf implements Runnable {
    public final int f35019a;
    public final xn f35020b;
    public final long f35021c;
    public final long d;

    public kf(xn xnVar, long j3, long j10, int i10) {
        this.f35019a = i10;
        this.f35020b = xnVar;
        this.f35021c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f35019a) {
            case 0:
                xn.i0(this.f35020b, this.f35021c, this.d);
                return;
            default:
                xn.b0(this.f35020b, this.f35021c, this.d);
                return;
        }
    }
}
