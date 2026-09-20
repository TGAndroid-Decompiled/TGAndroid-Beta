package org.telegram.ui;
public final class hf implements Runnable {
    public final int f34187a;
    public final zn f34188b;
    public final long f34189c;
    public final long d;

    public hf(zn znVar, long j3, long j10, int i10) {
        this.f34187a = i10;
        this.f34188b = znVar;
        this.f34189c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34187a) {
            case 0:
                zn.j0(this.f34188b, this.f34189c, this.d);
                return;
            default:
                zn.c0(this.f34188b, this.f34189c, this.d);
                return;
        }
    }
}
