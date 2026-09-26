package org.telegram.ui;
public final class aq implements Runnable {
    public final int f32210a;
    public final kq f32211b;
    public final long f32212c;

    public aq(kq kqVar, long j3, int i10) {
        this.f32210a = i10;
        this.f32211b = kqVar;
        this.f32212c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32210a) {
            case 0:
                long j3 = this.f32212c;
                kq kqVar = this.f32211b;
                kqVar.f35140n = j3;
                kqVar.f35145r = true;
                kqVar.n0();
                return;
            default:
                kq.Z(this.f32211b, this.f32212c);
                return;
        }
    }
}
