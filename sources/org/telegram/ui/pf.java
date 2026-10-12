package org.telegram.ui;
public final class pf implements Runnable {
    public final int f40949a;
    public final eo f40950b;
    public final long f40951c;
    public final long d;

    public pf(eo eoVar, long j3, long j10, int i10) {
        this.f40949a = i10;
        this.f40950b = eoVar;
        this.f40951c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f40949a) {
            case 0:
                eo.Y(this.f40950b, this.f40951c, this.d);
                return;
            default:
                eo.X(this.f40950b, this.f40951c, this.d);
                return;
        }
    }
}
