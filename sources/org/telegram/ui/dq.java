package org.telegram.ui;
public final class dq implements Runnable {
    public final int f33134a;
    public final nq f33135b;
    public final long f33136c;

    public dq(nq nqVar, long j3, int i10) {
        this.f33134a = i10;
        this.f33135b = nqVar;
        this.f33136c = j3;
    }

    @Override
    public final void run() {
        switch (this.f33134a) {
            case 0:
                long j3 = this.f33136c;
                nq nqVar = this.f33135b;
                nqVar.f36113n = j3;
                nqVar.f36118r = true;
                nqVar.n0();
                return;
            default:
                nq.Z(this.f33135b, this.f33136c);
                return;
        }
    }
}
