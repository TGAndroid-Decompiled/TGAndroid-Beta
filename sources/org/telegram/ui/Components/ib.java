package org.telegram.ui.Components;
public final class ib implements o1.f {
    public final int f27347a;
    public final Object f27348b;

    public ib(Object obj, int i10) {
        this.f27347a = i10;
        this.f27348b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27347a) {
            case 0:
                rc rcVar = (rc) this.f27348b;
                if (rcVar.d == hVar) {
                    rcVar.d = null;
                    return;
                }
                return;
            case 1:
                eb ebVar = (eb) this.f27348b;
                if (!z10) {
                    ebVar.run();
                    return;
                }
                return;
            case 2:
                op0 op0Var = (op0) this.f27348b;
                op0Var.f29428q = false;
                op0Var.dismiss();
                return;
            case 3:
                pp0 pp0Var = (pp0) this.f27348b;
                pp0Var.f29706s = false;
                pp0Var.f29705r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == pp0Var.f29703f) {
                    pp0Var.f29703f = null;
                    return;
                }
                return;
            case 4:
                zq0 zq0Var = (zq0) this.f27348b;
                zq0Var.E.setVisibility(8);
                zq0Var.f33629z0.setVisibility(8);
                wq0 wq0Var = zq0Var.L;
                wq0Var.f32606f = null;
                wq0Var.l();
                zq0Var.B0 = null;
                zq0Var.M0 = false;
                return;
            default:
                zq0 zq0Var2 = ((gq0) this.f27348b).d;
                zq0Var2.F.setVisibility(8);
                zq0Var2.G.setVisibility(8);
                zq0Var2.f33628y0.setVisibility(8);
                zq0Var2.B0 = null;
                return;
        }
    }
}
