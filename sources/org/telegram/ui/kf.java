package org.telegram.ui;
public final class kf implements Runnable {
    public final int f37964a;
    public final yn f37965b;
    public final long f37966c;
    public final long d;

    public kf(yn ynVar, long j3, long j10, int i10) {
        this.f37964a = i10;
        this.f37965b = ynVar;
        this.f37966c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f37964a) {
            case 0:
                yn.q0(this.f37965b, this.f37966c, this.d);
                return;
            default:
                yn.k1(this.f37965b, this.f37966c, this.d);
                return;
        }
    }
}
