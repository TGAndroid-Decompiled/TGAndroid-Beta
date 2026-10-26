package org.telegram.ui;
public final class cf implements Runnable {
    public final int f38441a;
    public final un f38442b;
    public final long f38443c;
    public final long d;

    public cf(un unVar, long j10, long j11, int i10) {
        this.f38441a = i10;
        this.f38442b = unVar;
        this.f38443c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f38441a) {
            case 0:
                un.E0(this.f38442b, this.f38443c, this.d);
                return;
            default:
                un.A1(this.f38442b, this.f38443c, this.d);
                return;
        }
    }
}
