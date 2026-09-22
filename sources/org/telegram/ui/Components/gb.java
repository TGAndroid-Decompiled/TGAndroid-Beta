package org.telegram.ui.Components;
public final class gb implements o1.f {
    public final int f24489a;
    public final Object f24490b;

    public gb(Object obj, int i10) {
        this.f24489a = i10;
        this.f24490b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f24489a) {
            case 0:
                pc pcVar = (pc) this.f24490b;
                if (pcVar.d == hVar) {
                    pcVar.d = null;
                    return;
                }
                return;
            case 1:
                cb cbVar = (cb) this.f24490b;
                if (!z10) {
                    cbVar.run();
                    return;
                }
                return;
            case 2:
                kp0 kp0Var = (kp0) this.f24490b;
                kp0Var.f25788q = false;
                kp0Var.dismiss();
                return;
            case 3:
                lp0 lp0Var = (lp0) this.f24490b;
                lp0Var.f26164s = false;
                lp0Var.f26163r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == lp0Var.f26161f) {
                    lp0Var.f26161f = null;
                    return;
                }
                return;
            case 4:
                wq0 wq0Var = (wq0) this.f24490b;
                wq0Var.E.setVisibility(8);
                wq0Var.f30130z0.setVisibility(8);
                tq0 tq0Var = wq0Var.L;
                tq0Var.f28521f = null;
                tq0Var.l();
                wq0Var.B0 = null;
                wq0Var.M0 = false;
                return;
            default:
                wq0 wq0Var2 = ((dq0) this.f24490b).d;
                wq0Var2.F.setVisibility(8);
                wq0Var2.G.setVisibility(8);
                wq0Var2.f30129y0.setVisibility(8);
                wq0Var2.B0 = null;
                return;
        }
    }
}
