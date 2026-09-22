package org.telegram.ui.Components;
public final class fb implements o1.f {
    public final int f23880a;
    public final Object f23881b;

    public fb(Object obj, int i10) {
        this.f23880a = i10;
        this.f23881b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23880a) {
            case 0:
                oc ocVar = (oc) this.f23881b;
                if (ocVar.d == hVar) {
                    ocVar.d = null;
                    return;
                }
                return;
            case 1:
                bb bbVar = (bb) this.f23881b;
                if (!z10) {
                    bbVar.run();
                    return;
                }
                return;
            case 2:
                vo0 vo0Var = (vo0) this.f23881b;
                vo0Var.f28849q = false;
                vo0Var.dismiss();
                return;
            case 3:
                wo0 wo0Var = (wo0) this.f23881b;
                wo0Var.f29764s = false;
                wo0Var.f29763r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == wo0Var.f29761f) {
                    wo0Var.f29761f = null;
                    return;
                }
                return;
            case 4:
                hq0 hq0Var = (hq0) this.f23881b;
                hq0Var.E.setVisibility(8);
                hq0Var.f24787z0.setVisibility(8);
                eq0 eq0Var = hq0Var.L;
                eq0Var.f23736f = null;
                eq0Var.l();
                hq0Var.B0 = null;
                hq0Var.M0 = false;
                return;
            default:
                hq0 hq0Var2 = ((op0) this.f23881b).d;
                hq0Var2.F.setVisibility(8);
                hq0Var2.G.setVisibility(8);
                hq0Var2.f24786y0.setVisibility(8);
                hq0Var2.B0 = null;
                return;
        }
    }
}
