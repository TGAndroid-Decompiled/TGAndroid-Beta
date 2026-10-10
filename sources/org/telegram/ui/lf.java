package org.telegram.ui;
public final class lf implements Runnable {
    public final int f39606a;
    public final zn f39607b;
    public final long f39608c;
    public final long d;

    public lf(zn znVar, long j3, long j10, int i10) {
        this.f39606a = i10;
        this.f39607b = znVar;
        this.f39608c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f39606a) {
            case 0:
                zn.Y(this.f39607b, this.f39608c, this.d);
                return;
            default:
                zn.X(this.f39607b, this.f39608c, this.d);
                return;
        }
    }
}
