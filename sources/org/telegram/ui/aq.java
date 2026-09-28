package org.telegram.ui;
public final class aq implements Runnable {
    public final int f32211a;
    public final kq f32212b;
    public final long f32213c;

    public aq(kq kqVar, long j3, int i10) {
        this.f32211a = i10;
        this.f32212b = kqVar;
        this.f32213c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32211a) {
            case 0:
                long j3 = this.f32213c;
                kq kqVar = this.f32212b;
                kqVar.f35141n = j3;
                kqVar.f35146r = true;
                kqVar.n0();
                return;
            default:
                kq.Z(this.f32212b, this.f32213c);
                return;
        }
    }
}
