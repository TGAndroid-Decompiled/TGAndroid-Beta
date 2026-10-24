package org.telegram.ui;
public final class df implements Runnable {
    public final int f36613a;
    public final sn f36614b;
    public final long f36615c;
    public final long d;

    public df(sn snVar, long j10, long j11, int i10) {
        this.f36613a = i10;
        this.f36614b = snVar;
        this.f36615c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36613a) {
            case 0:
                sn.Y(this.f36614b, this.f36615c, this.d);
                return;
            default:
                sn.X(this.f36614b, this.f36615c, this.d);
                return;
        }
    }
}
