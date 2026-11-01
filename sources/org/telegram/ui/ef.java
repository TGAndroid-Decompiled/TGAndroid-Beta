package org.telegram.ui;
public final class ef implements Runnable {
    public final int f36815a;
    public final un f36816b;
    public final long f36817c;
    public final long d;

    public ef(un unVar, long j10, long j11, int i10) {
        this.f36815a = i10;
        this.f36816b = unVar;
        this.f36817c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36815a) {
            case 0:
                un.Z(this.f36816b, this.f36817c, this.d);
                return;
            default:
                un.k1(this.f36816b, this.f36817c, this.d);
                return;
        }
    }
}
