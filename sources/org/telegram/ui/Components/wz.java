package org.telegram.ui.Components;
public final class wz implements Runnable {
    public final int f30094a;
    public final boolean f30095b;
    public final boolean f30096c;
    public final boolean d;
    public final Object e;

    public wz(Object obj, boolean z10, boolean z11, boolean z12, int i10) {
        this.f30094a = i10;
        this.e = obj;
        this.f30095b = z10;
        this.f30096c = z11;
        this.d = z12;
    }

    @Override
    public final void run() {
        switch (this.f30094a) {
            case 0:
                yz yzVar = (yz) this.e;
                if (this.f30095b) {
                    c00 c00Var = yzVar.J;
                    c00Var.f23060a = true;
                    c00Var.f23063b = true;
                }
                if (this.f30096c) {
                    yzVar.f30844x = true;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (this.d || Math.abs(yzVar.f30833a0 - currentTimeMillis) > 30) {
                    yzVar.f30833a0 = currentTimeMillis;
                    yzVar.f30838d0.run();
                    return;
                }
                return;
            default:
                ((org.telegram.ui.qg0) this.e).w1(this.f30095b, this.f30096c, this.d);
                return;
        }
    }
}
