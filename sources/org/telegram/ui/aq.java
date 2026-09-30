package org.telegram.ui;
public final class aq implements Runnable {
    public final int f32286a;
    public final kq f32287b;
    public final long f32288c;

    public aq(kq kqVar, long j3, int i10) {
        this.f32286a = i10;
        this.f32287b = kqVar;
        this.f32288c = j3;
    }

    @Override
    public final void run() {
        switch (this.f32286a) {
            case 0:
                long j3 = this.f32288c;
                kq kqVar = this.f32287b;
                kqVar.f35230n = j3;
                kqVar.f35235r = true;
                kqVar.n0();
                return;
            default:
                kq.Z(this.f32287b, this.f32288c);
                return;
        }
    }
}
