package org.telegram.ui;
public final class aq implements Runnable {
    public final int f32214a;
    public final kq f32215b;
    public final long f32216c;

    public aq(kq kqVar, long j3, int i10) {
        this.f32214a = i10;
        this.f32215b = kqVar;
        this.f32216c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32214a) {
            case 0:
                long j3 = this.f32216c;
                kq kqVar = this.f32215b;
                kqVar.f35124n = j3;
                kqVar.f35129r = true;
                kqVar.n0();
                return;
            default:
                kq.Z(this.f32215b, this.f32216c);
                return;
        }
    }
}
