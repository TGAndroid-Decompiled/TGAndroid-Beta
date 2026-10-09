package org.telegram.ui.Components;
public final class kb implements o1.f {
    public final int f27925a;
    public final Object f27926b;

    public kb(Object obj, int i10) {
        this.f27925a = i10;
        this.f27926b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27925a) {
            case 0:
                tc tcVar = (tc) this.f27926b;
                if (tcVar.d == hVar) {
                    tcVar.d = null;
                    return;
                }
                return;
            case 1:
                gb gbVar = (gb) this.f27926b;
                if (!z10) {
                    gbVar.run();
                    return;
                }
                return;
            case 2:
                gl glVar = (gl) this.f27926b;
                glVar.f26776i0 = null;
                glVar.f26777j0 = 1.0f;
                glVar.k0();
                return;
            case 3:
                aq0 aq0Var = (aq0) this.f27926b;
                aq0Var.f24740q = false;
                aq0Var.dismiss();
                return;
            case 4:
                bq0 bq0Var = (bq0) this.f27926b;
                bq0Var.f25093s = false;
                bq0Var.f25092r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == bq0Var.f25090f) {
                    bq0Var.f25090f = null;
                    return;
                }
                return;
            case 5:
                mr0 mr0Var = (mr0) this.f27926b;
                mr0Var.E.setVisibility(8);
                mr0Var.f28927z0.setVisibility(8);
                jr0 jr0Var = mr0Var.L;
                jr0Var.f27772f = null;
                jr0Var.l();
                mr0Var.B0 = null;
                mr0Var.M0 = false;
                return;
            default:
                mr0 mr0Var2 = ((tq0) this.f27926b).d;
                mr0Var2.F.setVisibility(8);
                mr0Var2.G.setVisibility(8);
                mr0Var2.f28926y0.setVisibility(8);
                mr0Var2.B0 = null;
                return;
        }
    }
}
