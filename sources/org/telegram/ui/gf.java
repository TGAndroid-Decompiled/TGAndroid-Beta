package org.telegram.ui;
public final class gf implements Runnable {
    public final int f33926a;
    public final wn f33927b;
    public final long f33928c;
    public final long d;

    public gf(wn wnVar, long j3, long j10, int i10) {
        this.f33926a = i10;
        this.f33927b = wnVar;
        this.f33928c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f33926a) {
            case 0:
                wn.i0(this.f33927b, this.f33928c, this.d);
                return;
            default:
                wn.b0(this.f33927b, this.f33928c, this.d);
                return;
        }
    }
}
