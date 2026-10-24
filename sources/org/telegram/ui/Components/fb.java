package org.telegram.ui.Components;
public final class fb implements o1.f {
    public final int f26281a;
    public final Object f26282b;

    public fb(Object obj, int i10) {
        this.f26281a = i10;
        this.f26282b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26281a) {
            case 0:
                oc ocVar = (oc) this.f26282b;
                if (ocVar.d == hVar) {
                    ocVar.d = null;
                    return;
                }
                return;
            case 1:
                bb bbVar = (bb) this.f26282b;
                if (!z10) {
                    bbVar.run();
                    return;
                }
                return;
            case 2:
                yk ykVar = (yk) this.f26282b;
                ykVar.f32953l0 = null;
                ykVar.m0 = 1.0f;
                ykVar.k0();
                return;
            case 3:
                vp0 vp0Var = (vp0) this.f26282b;
                vp0Var.f32010q = false;
                vp0Var.dismiss();
                return;
            case 4:
                wp0 wp0Var = (wp0) this.f26282b;
                wp0Var.f32321s = false;
                wp0Var.f32320r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == wp0Var.f32318f) {
                    wp0Var.f32318f = null;
                    return;
                }
                return;
            case 5:
                hr0 hr0Var = (hr0) this.f26282b;
                hr0Var.F.setVisibility(8);
                hr0Var.A0.setVisibility(8);
                er0 er0Var = hr0Var.M;
                er0Var.f26105f = null;
                er0Var.l();
                hr0Var.C0 = null;
                hr0Var.N0 = false;
                return;
            default:
                hr0 hr0Var2 = ((oq0) this.f26282b).d;
                hr0Var2.G.setVisibility(8);
                hr0Var2.H.setVisibility(8);
                hr0Var2.f27154z0.setVisibility(8);
                hr0Var2.C0 = null;
                return;
        }
    }
}
