package org.telegram.ui.Components;
public final class kb implements o1.f {
    public final int f27967a;
    public final Object f27968b;

    public kb(Object obj, int i10) {
        this.f27967a = i10;
        this.f27968b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27967a) {
            case 0:
                tc tcVar = (tc) this.f27968b;
                if (tcVar.d == hVar) {
                    tcVar.d = null;
                    return;
                }
                return;
            case 1:
                gb gbVar = (gb) this.f27968b;
                if (!z10) {
                    gbVar.run();
                    return;
                }
                return;
            case 2:
                gl glVar = (gl) this.f27968b;
                glVar.f26765i0 = null;
                glVar.f26766j0 = 1.0f;
                glVar.k0();
                return;
            case 3:
                bq0 bq0Var = (bq0) this.f27968b;
                bq0Var.f25025q = false;
                bq0Var.dismiss();
                return;
            case 4:
                cq0 cq0Var = (cq0) this.f27968b;
                cq0Var.f25385s = false;
                cq0Var.f25384r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == cq0Var.f25382f) {
                    cq0Var.f25382f = null;
                    return;
                }
                return;
            case 5:
                nr0 nr0Var = (nr0) this.f27968b;
                nr0Var.E.setVisibility(8);
                nr0Var.f29224z0.setVisibility(8);
                kr0 kr0Var = nr0Var.L;
                kr0Var.f28091f = null;
                kr0Var.l();
                nr0Var.B0 = null;
                nr0Var.M0 = false;
                return;
            default:
                nr0 nr0Var2 = ((uq0) this.f27968b).d;
                nr0Var2.F.setVisibility(8);
                nr0Var2.G.setVisibility(8);
                nr0Var2.f29223y0.setVisibility(8);
                nr0Var2.B0 = null;
                return;
        }
    }
}
