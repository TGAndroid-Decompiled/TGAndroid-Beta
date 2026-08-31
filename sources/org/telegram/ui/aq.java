package org.telegram.ui;
public final class aq implements Runnable {
    public final int f35226a;
    public final kq f35227b;
    public final long f35228c;

    public aq(kq kqVar, long j10, int i10) {
        this.f35226a = i10;
        this.f35227b = kqVar;
        this.f35228c = j10;
    }

    @Override
    public final void run() {
        switch (this.f35226a) {
            case 0:
                long j10 = this.f35228c;
                kq kqVar = this.f35227b;
                kqVar.f38472n = j10;
                kqVar.f38477r = true;
                kqVar.n0();
                return;
            default:
                kq.Z(this.f35227b, this.f35228c);
                return;
        }
    }
}
