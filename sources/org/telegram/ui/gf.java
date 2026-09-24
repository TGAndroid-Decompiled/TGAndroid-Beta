package org.telegram.ui;
public final class gf implements Runnable {
    public final int f33911a;
    public final wn f33912b;
    public final long f33913c;
    public final long d;

    public gf(wn wnVar, long j3, long j10, int i10) {
        this.f33911a = i10;
        this.f33912b = wnVar;
        this.f33913c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f33911a) {
            case 0:
                wn.i0(this.f33912b, this.f33913c, this.d);
                return;
            default:
                wn.b0(this.f33912b, this.f33913c, this.d);
                return;
        }
    }
}
