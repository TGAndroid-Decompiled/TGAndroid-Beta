package org.telegram.ui;
public final class df implements Runnable {
    public final int f36360a;
    public final qn f36361b;
    public final long f36362c;
    public final long d;

    public df(qn qnVar, long j10, long j11, int i10) {
        this.f36360a = i10;
        this.f36361b = qnVar;
        this.f36362c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36360a) {
            case 0:
                qn.Y(this.f36361b, this.f36362c, this.d);
                return;
            default:
                qn.X(this.f36361b, this.f36362c, this.d);
                return;
        }
    }
}
