package org.telegram.ui;
public final class df implements Runnable {
    public final int f36610a;
    public final sn f36611b;
    public final long f36612c;
    public final long d;

    public df(sn snVar, long j10, long j11, int i10) {
        this.f36610a = i10;
        this.f36611b = snVar;
        this.f36612c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36610a) {
            case 0:
                sn.Y(this.f36611b, this.f36612c, this.d);
                return;
            default:
                sn.X(this.f36611b, this.f36612c, this.d);
                return;
        }
    }
}
