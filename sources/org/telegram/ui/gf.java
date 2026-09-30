package org.telegram.ui;
public final class gf implements Runnable {
    public final int f34067a;
    public final wn f34068b;
    public final long f34069c;
    public final long d;

    public gf(wn wnVar, long j3, long j10, int i10) {
        this.f34067a = i10;
        this.f34068b = wnVar;
        this.f34069c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34067a) {
            case 0:
                wn.i0(this.f34068b, this.f34069c, this.d);
                return;
            default:
                wn.b0(this.f34068b, this.f34069c, this.d);
                return;
        }
    }
}
