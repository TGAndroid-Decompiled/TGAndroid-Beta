package org.telegram.ui.Components;
public final class jb implements o1.f {
    public final int f25952a;
    public final Object f25953b;

    public jb(Object obj, int i10) {
        this.f25952a = i10;
        this.f25953b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f25952a) {
            case 0:
                sc scVar = (sc) this.f25953b;
                if (scVar.d == hVar) {
                    scVar.d = null;
                    return;
                }
                return;
            case 1:
                fb fbVar = (fb) this.f25953b;
                if (!z10) {
                    fbVar.run();
                    return;
                }
                return;
            case 2:
                cl clVar = (cl) this.f25953b;
                clVar.f23778i0 = null;
                clVar.f23779j0 = 1.0f;
                clVar.k0();
                return;
            case 3:
                wp0 wp0Var = (wp0) this.f25953b;
                wp0Var.f30623q = false;
                wp0Var.dismiss();
                return;
            case 4:
                xp0 xp0Var = (xp0) this.f25953b;
                xp0Var.f30992s = false;
                xp0Var.f30991r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xp0Var.f30989f) {
                    xp0Var.f30989f = null;
                    return;
                }
                return;
            case 5:
                ir0 ir0Var = (ir0) this.f25953b;
                ir0Var.E.setVisibility(8);
                ir0Var.f25773z0.setVisibility(8);
                fr0 fr0Var = ir0Var.L;
                fr0Var.f24806f = null;
                fr0Var.l();
                ir0Var.B0 = null;
                ir0Var.M0 = false;
                return;
            default:
                ir0 ir0Var2 = ((pq0) this.f25953b).d;
                ir0Var2.F.setVisibility(8);
                ir0Var2.G.setVisibility(8);
                ir0Var2.f25772y0.setVisibility(8);
                ir0Var2.B0 = null;
                return;
        }
    }
}
