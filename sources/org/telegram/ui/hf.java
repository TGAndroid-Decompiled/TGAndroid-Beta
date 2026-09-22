package org.telegram.ui;
public final class hf implements Runnable {
    public final int f34203a;
    public final zn f34204b;
    public final long f34205c;
    public final long d;

    public hf(zn znVar, long j3, long j10, int i10) {
        this.f34203a = i10;
        this.f34204b = znVar;
        this.f34205c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f34203a) {
            case 0:
                zn.j0(this.f34204b, this.f34205c, this.d);
                return;
            default:
                zn.c0(this.f34204b, this.f34205c, this.d);
                return;
        }
    }
}
