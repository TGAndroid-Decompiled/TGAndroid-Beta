package org.telegram.ui;
public final class dq implements Runnable {
    public final int f37105a;
    public final nq f37106b;
    public final long f37107c;

    public dq(nq nqVar, long j3, int i10) {
        this.f37105a = i10;
        this.f37106b = nqVar;
        this.f37107c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37105a) {
            case 0:
                long j3 = this.f37107c;
                nq nqVar = this.f37106b;
                nqVar.f40375n = j3;
                nqVar.f40380r = true;
                nqVar.n0();
                return;
            default:
                nq.Z(this.f37106b, this.f37107c);
                return;
        }
    }
}
