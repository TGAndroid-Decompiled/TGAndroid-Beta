package org.telegram.ui.Components;
public final class ib implements o1.f {
    public final int f27448a;
    public final Object f27449b;

    public ib(Object obj, int i10) {
        this.f27448a = i10;
        this.f27449b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27448a) {
            case 0:
                rc rcVar = (rc) this.f27449b;
                if (rcVar.d == hVar) {
                    rcVar.d = null;
                    return;
                }
                return;
            case 1:
                eb ebVar = (eb) this.f27449b;
                if (!z10) {
                    ebVar.run();
                    return;
                }
                return;
            case 2:
                pp0 pp0Var = (pp0) this.f27449b;
                pp0Var.f29800q = false;
                pp0Var.dismiss();
                return;
            case 3:
                qp0 qp0Var = (qp0) this.f27449b;
                qp0Var.f30179s = false;
                qp0Var.f30178r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == qp0Var.f30176f) {
                    qp0Var.f30176f = null;
                    return;
                }
                return;
            case 4:
                br0 br0Var = (br0) this.f27449b;
                br0Var.E.setVisibility(8);
                br0Var.f25085z0.setVisibility(8);
                yq0 yq0Var = br0Var.L;
                yq0Var.f33336f = null;
                yq0Var.l();
                br0Var.B0 = null;
                br0Var.M0 = false;
                return;
            default:
                br0 br0Var2 = ((iq0) this.f27449b).d;
                br0Var2.F.setVisibility(8);
                br0Var2.G.setVisibility(8);
                br0Var2.f25084y0.setVisibility(8);
                br0Var2.B0 = null;
                return;
        }
    }
}
