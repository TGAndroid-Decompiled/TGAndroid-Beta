package org.telegram.ui;
public final class dq implements Runnable {
    public final int f37061a;
    public final nq f37062b;
    public final long f37063c;

    public dq(nq nqVar, long j3, int i10) {
        this.f37061a = i10;
        this.f37062b = nqVar;
        this.f37063c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37061a) {
            case 0:
                long j3 = this.f37063c;
                nq nqVar = this.f37062b;
                nqVar.f40331n = j3;
                nqVar.f40336r = true;
                nqVar.n0();
                return;
            default:
                nq.Z(this.f37062b, this.f37063c);
                return;
        }
    }
}
