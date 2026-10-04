package org.telegram.ui;
public final class kf implements Runnable {
    public final int f37963a;
    public final yn f37964b;
    public final long f37965c;
    public final long d;

    public kf(yn ynVar, long j3, long j10, int i10) {
        this.f37963a = i10;
        this.f37964b = ynVar;
        this.f37965c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f37963a) {
            case 0:
                yn.q0(this.f37964b, this.f37965c, this.d);
                return;
            default:
                yn.k1(this.f37964b, this.f37965c, this.d);
                return;
        }
    }
}
