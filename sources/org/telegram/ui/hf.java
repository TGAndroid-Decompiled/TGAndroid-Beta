package org.telegram.ui;
public final class hf implements Runnable {
    public final int f33840a;
    public final xn f33841b;
    public final long f33842c;
    public final long d;

    public hf(xn xnVar, long j3, long j10, int i10) {
        this.f33840a = i10;
        this.f33841b = xnVar;
        this.f33842c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f33840a) {
            case 0:
                xn.p0(this.f33841b, this.f33842c, this.d);
                return;
            default:
                xn.k1(this.f33841b, this.f33842c, this.d);
                return;
        }
    }
}
