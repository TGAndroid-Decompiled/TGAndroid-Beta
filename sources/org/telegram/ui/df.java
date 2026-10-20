package org.telegram.ui;
public final class df implements Runnable {
    public final int f36356a;
    public final qn f36357b;
    public final long f36358c;
    public final long d;

    public df(qn qnVar, long j10, long j11, int i10) {
        this.f36356a = i10;
        this.f36357b = qnVar;
        this.f36358c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36356a) {
            case 0:
                qn.Y(this.f36357b, this.f36358c, this.d);
                return;
            default:
                qn.X(this.f36357b, this.f36358c, this.d);
                return;
        }
    }
}
