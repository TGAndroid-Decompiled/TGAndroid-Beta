package org.telegram.ui;
public final class kf implements Runnable {
    public final int f37969a;
    public final yn f37970b;
    public final long f37971c;
    public final long d;

    public kf(yn ynVar, long j3, long j10, int i10) {
        this.f37969a = i10;
        this.f37970b = ynVar;
        this.f37971c = j3;
        this.d = j10;
    }

    @Override
    public final void run() {
        switch (this.f37969a) {
            case 0:
                yn.q0(this.f37970b, this.f37971c, this.d);
                return;
            default:
                yn.k1(this.f37970b, this.f37971c, this.d);
                return;
        }
    }
}
