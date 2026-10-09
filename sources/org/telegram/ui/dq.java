package org.telegram.ui;
public final class dq implements Runnable {
    public final int f37059a;
    public final nq f37060b;
    public final long f37061c;

    public dq(nq nqVar, long j3, int i10) {
        this.f37059a = i10;
        this.f37060b = nqVar;
        this.f37061c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37059a) {
            case 0:
                long j3 = this.f37061c;
                nq nqVar = this.f37060b;
                nqVar.f40329n = j3;
                nqVar.f40334r = true;
                nqVar.n0();
                return;
            default:
                nq.Z(this.f37060b, this.f37061c);
                return;
        }
    }
}
