package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36900a;
    public final sn f36901b;
    public final long f36902c;
    public final long d;

    public ff(sn snVar, long j10, long j11, int i10) {
        this.f36900a = i10;
        this.f36901b = snVar;
        this.f36902c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36900a) {
            case 0:
                sn.Y(this.f36901b, this.f36902c, this.d);
                return;
            default:
                sn.X(this.f36901b, this.f36902c, this.d);
                return;
        }
    }
}
