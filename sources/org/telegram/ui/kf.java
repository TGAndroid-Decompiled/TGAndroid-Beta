package org.telegram.ui;
public final class kf implements Runnable {
    public final int f39356a;
    public final zn f39357b;
    public final long f39358c;
    public final long d;

    public kf(zn znVar, long j3, long j10, int i10) {
        this.f39356a = i10;
        this.f39357b = znVar;
        this.f39358c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f39356a) {
            case 0:
                zn.Y(this.f39357b, this.f39358c, this.d);
                return;
            default:
                zn.X(this.f39357b, this.f39358c, this.d);
                return;
        }
    }
}
