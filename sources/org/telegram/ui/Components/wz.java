package org.telegram.ui.Components;
public final class wz implements Runnable {
    public final int f32671a;
    public final boolean f32672b;
    public final boolean f32673c;
    public final boolean d;
    public final Object f32674e;

    public wz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f32671a = i10;
        this.f32674e = obj;
        this.f32672b = z10;
        this.f32673c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f32671a) {
            case 0:
                yz yzVar = (yz) this.f32674e;
                if (this.f32672b) {
                    c00 c00Var = yzVar.J;
                    c00Var.f25095a = true;
                    c00Var.f25098b = true;
                }
                if (this.f32673c) {
                    yzVar.f33303x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(yzVar.f33291a0 - currentTimeMillis) > 30) {
                    yzVar.f33291a0 = currentTimeMillis;
                    yzVar.f33296d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.ug0) this.f32674e).w1(this.f32672b, this.f32673c, this.d);
                return;
        }
    }
}
