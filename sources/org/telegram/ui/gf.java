package org.telegram.ui;
public final class gf implements Runnable {
    public final int f33925a;
    public final wn f33926b;
    public final long f33927c;
    public final long d;

    public gf(wn wnVar, long j3, long j10, int i10) {
        this.f33925a = i10;
        this.f33926b = wnVar;
        this.f33927c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f33925a) {
            case 0:
                wn.i0(this.f33926b, this.f33927c, this.d);
                return;
            default:
                wn.b0(this.f33926b, this.f33927c, this.d);
                return;
        }
    }
}
