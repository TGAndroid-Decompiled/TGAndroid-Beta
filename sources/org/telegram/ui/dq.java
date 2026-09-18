package org.telegram.ui;
public final class dq implements Runnable {
    public final int f33063a;
    public final nq f33064b;
    public final long f33065c;

    public dq(nq nqVar, long j3, int i10) {
        this.f33063a = i10;
        this.f33064b = nqVar;
        this.f33065c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33063a) {
            case 0:
                long j3 = this.f33065c;
                nq nqVar = this.f33064b;
                nqVar.f36018n = j3;
                nqVar.f36023r = true;
                nqVar.n0();
                return;
            default:
                nq.Z(this.f33064b, this.f33065c);
                return;
        }
    }
}
