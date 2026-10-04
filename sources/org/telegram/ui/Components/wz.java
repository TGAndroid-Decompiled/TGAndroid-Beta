package org.telegram.ui.Components;
public final class wz implements Runnable {
    public final int f32678a;
    public final boolean f32679b;
    public final boolean f32680c;
    public final boolean d;
    public final Object f32681e;

    public wz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f32678a = i10;
        this.f32681e = obj;
        this.f32679b = z10;
        this.f32680c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f32678a) {
            case 0:
                yz yzVar = (yz) this.f32681e;
                if (this.f32679b) {
                    c00 c00Var = yzVar.J;
                    c00Var.f25101a = true;
                    c00Var.f25104b = true;
                }
                if (this.f32680c) {
                    yzVar.f33310x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(yzVar.f33298a0 - currentTimeMillis) > 30) {
                    yzVar.f33298a0 = currentTimeMillis;
                    yzVar.f33303d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ug0) this.f32681e).w1(this.f32679b, this.f32680c, this.d);
                return;
        }
    }
}
