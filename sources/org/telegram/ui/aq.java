package org.telegram.ui;
public final class aq implements Runnable {
    public final int f35235a;
    public final kq f35236b;
    public final long f35237c;

    public aq(kq kqVar, long j10, int i10) {
        this.f35235a = i10;
        this.f35236b = kqVar;
        this.f35237c = j10;
    }

    @Override
    public final void run() {
        switch (this.f35235a) {
            case 0:
                long j10 = this.f35237c;
                kq kqVar = this.f35236b;
                kqVar.f38382n = j10;
                kqVar.f38387r = true;
                kqVar.n0();
                return;
            default:
                kq.Z(this.f35236b, this.f35237c);
                return;
        }
    }
}
