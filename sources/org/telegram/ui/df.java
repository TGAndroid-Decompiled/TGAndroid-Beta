package org.telegram.ui;
public final class df implements Runnable {
    public final int f36350a;
    public final qn f36351b;
    public final long f36352c;
    public final long d;

    public df(qn qnVar, long j10, long j11, int i10) {
        this.f36350a = i10;
        this.f36351b = qnVar;
        this.f36352c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36350a) {
            case 0:
                qn.Y(this.f36351b, this.f36352c, this.d);
                return;
            default:
                qn.X(this.f36351b, this.f36352c, this.d);
                return;
        }
    }
}
