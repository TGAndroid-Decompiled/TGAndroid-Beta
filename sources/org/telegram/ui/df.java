package org.telegram.ui;
public final class df implements Runnable {
    public final int f36361a;
    public final qn f36362b;
    public final long f36363c;
    public final long d;

    public df(qn qnVar, long j10, long j11, int i10) {
        this.f36361a = i10;
        this.f36362b = qnVar;
        this.f36363c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36361a) {
            case 0:
                qn.Y(this.f36362b, this.f36363c, this.d);
                return;
            default:
                qn.X(this.f36362b, this.f36363c, this.d);
                return;
        }
    }
}
