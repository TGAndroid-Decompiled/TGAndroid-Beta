package org.telegram.ui;
public final class kf implements Runnable {
    public final int f39322a;
    public final zn f39323b;
    public final long f39324c;
    public final long d;

    public kf(zn znVar, long j3, long j10, int i10) {
        this.f39322a = i10;
        this.f39323b = znVar;
        this.f39324c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f39322a) {
            case 0:
                zn.Y(this.f39323b, this.f39324c, this.d);
                return;
            default:
                zn.X(this.f39323b, this.f39324c, this.d);
                return;
        }
    }
}
