package org.telegram.ui;
public final class kf implements Runnable {
    public final int f37995a;
    public final yn f37996b;
    public final long f37997c;
    public final long d;

    public kf(yn ynVar, long j3, long j10, int i10) {
        this.f37995a = i10;
        this.f37996b = ynVar;
        this.f37997c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f37995a) {
            case 0:
                yn.q0(this.f37996b, this.f37997c, this.d);
                return;
            default:
                yn.k1(this.f37996b, this.f37997c, this.d);
                return;
        }
    }
}
