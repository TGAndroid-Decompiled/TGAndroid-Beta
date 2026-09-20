package org.telegram.ui;
public final class dq implements Runnable {
    public final int f33114a;
    public final nq f33115b;
    public final long f33116c;

    public dq(nq nqVar, long j3, int i10) {
        this.f33114a = i10;
        this.f33115b = nqVar;
        this.f33116c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33114a) {
            case 0:
                long j3 = this.f33116c;
                nq nqVar = this.f33115b;
                nqVar.f36095n = j3;
                nqVar.f36100r = true;
                nqVar.n0();
                return;
            default:
                nq.Z(this.f33115b, this.f33116c);
                return;
        }
    }
}
