package org.telegram.ui;
public final class lf implements Runnable {
    public final int f39562a;
    public final zn f39563b;
    public final long f39564c;
    public final long d;

    public lf(zn znVar, long j3, long j10, int i10) {
        this.f39562a = i10;
        this.f39563b = znVar;
        this.f39564c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f39562a) {
            case 0:
                zn.Y(this.f39563b, this.f39564c, this.d);
                return;
            default:
                zn.X(this.f39563b, this.f39564c, this.d);
                return;
        }
    }
}
