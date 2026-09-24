package org.telegram.ui;
public final class aq implements Runnable {
    public final int f32198a;
    public final kq f32199b;
    public final long f32200c;

    public aq(kq kqVar, long j3, int i10) {
        this.f32198a = i10;
        this.f32199b = kqVar;
        this.f32200c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32198a) {
            case 0:
                long j3 = this.f32200c;
                kq kqVar = this.f32199b;
                kqVar.f35108n = j3;
                kqVar.f35113r = true;
                kqVar.n0();
                return;
            default:
                kq.Z(this.f32199b, this.f32200c);
                return;
        }
    }
}
