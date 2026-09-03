package org.telegram.ui;
public final class ff implements Runnable {
    public final int f34061a;
    public final zn f34062b;
    public final long f34063c;
    public final long d;

    public ff(zn znVar, long j10, long j11, int i10) {
        this.f34061a = i10;
        this.f34062b = znVar;
        this.f34063c = j10;
        this.d = j11;
    }

    @Override
    public final void run() {
        switch (this.f34061a) {
            case 0:
                zn.o0(this.f34062b, this.f34063c, this.d);
                return;
            default:
                zn.k1(this.f34062b, this.f34063c, this.d);
                return;
        }
    }
}
