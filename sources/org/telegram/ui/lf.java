package org.telegram.ui;
public final class lf implements Runnable {
    public final int f39560a;
    public final zn f39561b;
    public final long f39562c;
    public final long d;

    public lf(zn znVar, long j3, long j10, int i10) {
        this.f39560a = i10;
        this.f39561b = znVar;
        this.f39562c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f39560a) {
            case 0:
                zn.Y(this.f39561b, this.f39562c, this.d);
                return;
            default:
                zn.X(this.f39561b, this.f39562c, this.d);
                return;
        }
    }
}
