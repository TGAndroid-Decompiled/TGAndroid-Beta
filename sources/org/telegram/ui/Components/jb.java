package org.telegram.ui.Components;
public final class jb implements o1.f {
    public final int f27445a;
    public final Object f27446b;

    public jb(Object obj, int i10) {
        this.f27445a = i10;
        this.f27446b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27445a) {
            case 0:
                sc scVar = (sc) this.f27446b;
                if (scVar.d == hVar) {
                    scVar.d = null;
                    return;
                }
                return;
            case 1:
                fb fbVar = (fb) this.f27446b;
                if (!z10) {
                    fbVar.run();
                    return;
                }
                return;
            case 2:
                il ilVar = (il) this.f27446b;
                ilVar.f27200i0 = null;
                ilVar.f27201j0 = 1.0f;
                ilVar.k0();
                return;
            case 3:
                gq0 gq0Var = (gq0) this.f27446b;
                gq0Var.f26488q = false;
                gq0Var.dismiss();
                return;
            case 4:
                hq0 hq0Var = (hq0) this.f27446b;
                hq0Var.f26888s = false;
                hq0Var.f26887r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == hq0Var.f26885f) {
                    hq0Var.f26885f = null;
                    return;
                }
                return;
            case 5:
                sr0 sr0Var = (sr0) this.f27446b;
                sr0Var.E.setVisibility(8);
                sr0Var.f30664z0.setVisibility(8);
                pr0 pr0Var = sr0Var.L;
                pr0Var.f29579f = null;
                pr0Var.l();
                sr0Var.B0 = null;
                sr0Var.M0 = false;
                return;
            default:
                sr0 sr0Var2 = ((zq0) this.f27446b).d;
                sr0Var2.F.setVisibility(8);
                sr0Var2.G.setVisibility(8);
                sr0Var2.f30663y0.setVisibility(8);
                sr0Var2.B0 = null;
                return;
        }
    }
}
