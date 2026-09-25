package org.telegram.ui;
public final class aq implements Runnable {
    public final int f32212a;
    public final kq f32213b;
    public final long f32214c;

    public aq(kq kqVar, long j3, int i10) {
        this.f32212a = i10;
        this.f32213b = kqVar;
        this.f32214c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32212a) {
            case 0:
                long j3 = this.f32214c;
                kq kqVar = this.f32213b;
                kqVar.f35142n = j3;
                kqVar.f35147r = true;
                kqVar.n0();
                return;
            default:
                kq.Z(this.f32213b, this.f32214c);
                return;
        }
    }
}
