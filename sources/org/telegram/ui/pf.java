package org.telegram.ui;
public final class pf implements Runnable {
    public final int f40947a;
    public final eo f40948b;
    public final long f40949c;
    public final long d;

    public pf(eo eoVar, long j3, long j10, int i10) {
        this.f40947a = i10;
        this.f40948b = eoVar;
        this.f40949c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f40947a) {
            case 0:
                eo.Y(this.f40948b, this.f40949c, this.d);
                return;
            default:
                eo.X(this.f40948b, this.f40949c, this.d);
                return;
        }
    }
}
