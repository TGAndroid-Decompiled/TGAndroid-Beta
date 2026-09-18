package org.telegram.ui;
public final class hf implements Runnable {
    public final int f34146a;
    public final zn f34147b;
    public final long f34148c;
    public final long d;

    public hf(zn znVar, long j3, long j10, int i10) {
        this.f34146a = i10;
        this.f34147b = znVar;
        this.f34148c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34146a) {
            case 0:
                zn.j0(this.f34147b, this.f34148c, this.d);
                return;
            default:
                zn.c0(this.f34147b, this.f34148c, this.d);
                return;
        }
    }
}
