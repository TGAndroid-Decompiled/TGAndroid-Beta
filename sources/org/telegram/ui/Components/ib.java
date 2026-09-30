package org.telegram.ui.Components;
public final class ib implements o1.f {
    public final int f25056a;
    public final Object f25057b;

    public ib(Object obj, int i10) {
        this.f25056a = i10;
        this.f25057b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f25056a) {
            case 0:
                rc rcVar = (rc) this.f25057b;
                if (rcVar.d == hVar) {
                    rcVar.d = null;
                    return;
                }
                return;
            case 1:
                eb ebVar = (eb) this.f25057b;
                if (!z10) {
                    ebVar.run();
                    return;
                }
                return;
            case 2:
                lp0 lp0Var = (lp0) this.f25057b;
                lp0Var.f26075q = false;
                lp0Var.dismiss();
                return;
            case 3:
                mp0 mp0Var = (mp0) this.f25057b;
                mp0Var.f26354s = false;
                mp0Var.f26353r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == mp0Var.f26351f) {
                    mp0Var.f26351f = null;
                    return;
                }
                return;
            case 4:
                xq0 xq0Var = (xq0) this.f25057b;
                xq0Var.E.setVisibility(8);
                xq0Var.f30487z0.setVisibility(8);
                uq0 uq0Var = xq0Var.L;
                uq0Var.f28911f = null;
                uq0Var.l();
                xq0Var.B0 = null;
                xq0Var.M0 = false;
                return;
            default:
                xq0 xq0Var2 = ((eq0) this.f25057b).d;
                xq0Var2.F.setVisibility(8);
                xq0Var2.G.setVisibility(8);
                xq0Var2.f30486y0.setVisibility(8);
                xq0Var2.B0 = null;
                return;
        }
    }
}
