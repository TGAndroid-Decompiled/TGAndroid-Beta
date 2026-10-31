package org.telegram.ui;
public final class ff implements Runnable {
    public final int f37256a;
    public final un f37257b;
    public final long f37258c;
    public final long d;

    public ff(un unVar, long j10, long j11, int i10) {
        this.f37256a = i10;
        this.f37257b = unVar;
        this.f37258c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f37256a) {
            case 0:
                un.E0(this.f37257b, this.f37258c, this.d);
                return;
            default:
                un.h0(this.f37257b, this.f37258c, this.d);
                return;
        }
    }
}
