package org.telegram.ui.Components;
public final class fb implements o1.f {
    public final int f23881a;
    public final Object f23882b;

    public fb(Object obj, int i10) {
        this.f23881a = i10;
        this.f23882b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23881a) {
            case 0:
                oc ocVar = (oc) this.f23882b;
                if (ocVar.d == hVar) {
                    ocVar.d = null;
                    return;
                }
                return;
            case 1:
                bb bbVar = (bb) this.f23882b;
                if (!z10) {
                    bbVar.run();
                    return;
                }
                return;
            case 2:
                vo0 vo0Var = (vo0) this.f23882b;
                vo0Var.f28852q = false;
                vo0Var.dismiss();
                return;
            case 3:
                wo0 wo0Var = (wo0) this.f23882b;
                wo0Var.f29767s = false;
                wo0Var.f29766r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == wo0Var.f29764f) {
                    wo0Var.f29764f = null;
                    return;
                }
                return;
            case 4:
                hq0 hq0Var = (hq0) this.f23882b;
                hq0Var.E.setVisibility(8);
                hq0Var.f24781z0.setVisibility(8);
                eq0 eq0Var = hq0Var.L;
                eq0Var.f23737f = null;
                eq0Var.l();
                hq0Var.B0 = null;
                hq0Var.M0 = false;
                return;
            default:
                hq0 hq0Var2 = ((op0) this.f23882b).d;
                hq0Var2.F.setVisibility(8);
                hq0Var2.G.setVisibility(8);
                hq0Var2.f24780y0.setVisibility(8);
                hq0Var2.B0 = null;
                return;
        }
    }
}
