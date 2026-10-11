package org.telegram.ui;
public final class dq implements Runnable {
    public final int f37098a;
    public final nq f37099b;
    public final long f37100c;

    public dq(nq nqVar, long j3, int i10) {
        this.f37098a = i10;
        this.f37099b = nqVar;
        this.f37100c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37098a) {
            case 0:
                long j3 = this.f37100c;
                nq nqVar = this.f37099b;
                nqVar.f40360n = j3;
                nqVar.f40365r = true;
                nqVar.n0();
                return;
            default:
                nq.Z(this.f37099b, this.f37100c);
                return;
        }
    }
}
