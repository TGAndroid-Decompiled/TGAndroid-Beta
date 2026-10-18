package org.telegram.ui;
public final class ff implements Runnable {
    public final int f36916a;
    public final sn f36917b;
    public final long f36918c;
    public final long d;

    public ff(sn snVar, long j10, long j11, int i10) {
        this.f36916a = i10;
        this.f36917b = snVar;
        this.f36918c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f36916a) {
            case 0:
                sn.Y(this.f36917b, this.f36918c, this.d);
                return;
            default:
                sn.X(this.f36917b, this.f36918c, this.d);
                return;
        }
    }
}
