package org.telegram.ui.Components;
public final class ib implements o1.f {
    public final int f27353a;
    public final Object f27354b;

    public ib(Object obj, int i10) {
        this.f27353a = i10;
        this.f27354b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27353a) {
            case 0:
                rc rcVar = (rc) this.f27354b;
                if (rcVar.d == hVar) {
                    rcVar.d = null;
                    return;
                }
                return;
            case 1:
                eb ebVar = (eb) this.f27354b;
                if (!z10) {
                    ebVar.run();
                    return;
                }
                return;
            case 2:
                op0 op0Var = (op0) this.f27354b;
                op0Var.f29434q = false;
                op0Var.dismiss();
                return;
            case 3:
                pp0 pp0Var = (pp0) this.f27354b;
                pp0Var.f29712s = false;
                pp0Var.f29711r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == pp0Var.f29709f) {
                    pp0Var.f29709f = null;
                    return;
                }
                return;
            case 4:
                zq0 zq0Var = (zq0) this.f27354b;
                zq0Var.E.setVisibility(8);
                zq0Var.f33636z0.setVisibility(8);
                wq0 wq0Var = zq0Var.L;
                wq0Var.f32613f = null;
                wq0Var.l();
                zq0Var.B0 = null;
                zq0Var.M0 = false;
                return;
            default:
                zq0 zq0Var2 = ((gq0) this.f27354b).d;
                zq0Var2.F.setVisibility(8);
                zq0Var2.G.setVisibility(8);
                zq0Var2.f33635y0.setVisibility(8);
                zq0Var2.B0 = null;
                return;
        }
    }
}
