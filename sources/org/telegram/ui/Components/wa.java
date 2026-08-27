package org.telegram.ui.Components;

public final class wa implements o1.f {

    public final int f34150a;

    public final Object f34151b;

    public wa(Object obj, int i10) {
        this.f34150a = i10;
        this.f34151b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f34150a) {
            case 0:
                ec ecVar = (ec) this.f34151b;
                if (ecVar.d == hVar) {
                    ecVar.d = null;
                }
                break;
            case 1:
                sa saVar = (sa) this.f34151b;
                if (!z10) {
                    saVar.run();
                }
                break;
            case 2:
                fo0 fo0Var = (fo0) this.f34151b;
                fo0Var.f28413q = false;
                fo0Var.dismiss();
                break;
            case 3:
                go0 go0Var = (go0) this.f34151b;
                go0Var.f28786s = false;
                go0Var.f28785r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == go0Var.f28783f) {
                    go0Var.f28783f = null;
                }
                break;
            case 4:
                sp0 sp0Var = (sp0) this.f34151b;
                sp0Var.A.setVisibility(8);
                sp0Var.f32546v0.setVisibility(8);
                pp0 pp0Var = sp0Var.H;
                pp0Var.f31649f = null;
                pp0Var.l();
                sp0Var.f32550x0 = null;
                sp0Var.I0 = false;
                break;
            default:
                sp0 sp0Var2 = ((yo0) this.f34151b).d;
                sp0Var2.B.setVisibility(8);
                sp0Var2.C.setVisibility(8);
                sp0Var2.f32545u0.setVisibility(8);
                sp0Var2.f32550x0 = null;
                break;
        }
    }
}
