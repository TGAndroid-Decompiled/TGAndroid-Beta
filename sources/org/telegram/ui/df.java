package org.telegram.ui;
public final class df implements Runnable {
    public final int f36378a;
    public final qn f36379b;
    public final long f36380c;
    public final long d;

    public df(qn qnVar, long j10, long j11, int i10) {
        this.f36378a = i10;
        this.f36379b = qnVar;
        this.f36380c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36378a) {
            case 0:
                qn.Y(this.f36379b, this.f36380c, this.d);
                return;
            default:
                qn.X(this.f36379b, this.f36380c, this.d);
                return;
        }
    }
}
