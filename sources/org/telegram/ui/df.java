package org.telegram.ui;
public final class df implements Runnable {
    public final int f36357a;
    public final qn f36358b;
    public final long f36359c;
    public final long d;

    public df(qn qnVar, long j10, long j11, int i10) {
        this.f36357a = i10;
        this.f36358b = qnVar;
        this.f36359c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36357a) {
            case 0:
                qn.Y(this.f36358b, this.f36359c, this.d);
                return;
            default:
                qn.X(this.f36358b, this.f36359c, this.d);
                return;
        }
    }
}
