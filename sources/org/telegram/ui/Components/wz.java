package org.telegram.ui.Components;
public final class wz implements Runnable {
    public final int f32672a;
    public final boolean f32673b;
    public final boolean f32674c;
    public final boolean d;
    public final Object f32675e;

    public wz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f32672a = i10;
        this.f32675e = obj;
        this.f32673b = z10;
        this.f32674c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f32672a) {
            case 0:
                yz yzVar = (yz) this.f32675e;
                if (this.f32673b) {
                    c00 c00Var = yzVar.J;
                    c00Var.f25096a = true;
                    c00Var.f25099b = true;
                }
                if (this.f32674c) {
                    yzVar.f33304x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(yzVar.f33292a0 - currentTimeMillis) > 30) {
                    yzVar.f33292a0 = currentTimeMillis;
                    yzVar.f33297d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ug0) this.f32675e).w1(this.f32673b, this.f32674c, this.d);
                return;
        }
    }
}
