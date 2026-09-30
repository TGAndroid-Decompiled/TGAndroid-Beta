package org.telegram.ui;
public final class gf implements Runnable {
    public final int f33927a;
    public final wn f33928b;
    public final long f33929c;
    public final long d;

    public gf(wn wnVar, long j3, long j10, int i10) {
        this.f33927a = i10;
        this.f33928b = wnVar;
        this.f33929c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f33927a) {
            case 0:
                wn.i0(this.f33928b, this.f33929c, this.d);
                return;
            default:
                wn.b0(this.f33928b, this.f33929c, this.d);
                return;
        }
    }
}
