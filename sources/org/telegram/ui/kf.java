package org.telegram.ui;
public final class kf implements Runnable {
    public final int f34351a;
    public final eo f34352b;
    public final long f34353c;
    public final long d;

    public kf(eo eoVar, long j3, long j10, int i10) {
        this.f34351a = i10;
        this.f34352b = eoVar;
        this.f34353c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34351a) {
            case 0:
                eo.o0(this.f34352b, this.f34353c, this.d);
                return;
            default:
                eo.k1(this.f34352b, this.f34353c, this.d);
                return;
        }
    }
}
