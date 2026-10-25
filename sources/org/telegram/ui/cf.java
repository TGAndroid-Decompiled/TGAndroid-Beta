package org.telegram.ui;
public final class cf implements Runnable {
    public final int f38438a;
    public final un f38439b;
    public final long f38440c;
    public final long d;

    public cf(un unVar, long j10, long j11, int i10) {
        this.f38438a = i10;
        this.f38439b = unVar;
        this.f38440c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f38438a) {
            case 0:
                un.E0(this.f38439b, this.f38440c, this.d);
                return;
            default:
                un.A1(this.f38439b, this.f38440c, this.d);
                return;
        }
    }
}
