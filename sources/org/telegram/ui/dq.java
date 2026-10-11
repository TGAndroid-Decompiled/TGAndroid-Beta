package org.telegram.ui;
public final class dq implements Runnable {
    public final int f37064a;
    public final nq f37065b;
    public final long f37066c;

    public dq(nq nqVar, long j3, int i10) {
        this.f37064a = i10;
        this.f37065b = nqVar;
        this.f37066c = j3;
    }

    @Override
    public final void run() {
        switch (this.f37064a) {
            case 0:
                long j3 = this.f37066c;
                nq nqVar = this.f37065b;
                nqVar.f40326n = j3;
                nqVar.f40331r = true;
                nqVar.n0();
                return;
            default:
                nq.Z(this.f37065b, this.f37066c);
                return;
        }
    }
}
