package org.telegram.ui.Components;
public final class jb implements o1.f {
    public final int f27439a;
    public final Object f27440b;

    public jb(Object obj, int i10) {
        this.f27439a = i10;
        this.f27440b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27439a) {
            case 0:
                sc scVar = (sc) this.f27440b;
                if (scVar.d == hVar) {
                    scVar.d = null;
                    return;
                }
                return;
            case 1:
                fb fbVar = (fb) this.f27440b;
                if (!z10) {
                    fbVar.run();
                    return;
                }
                return;
            case 2:
                il ilVar = (il) this.f27440b;
                ilVar.f27194i0 = null;
                ilVar.f27195j0 = 1.0f;
                ilVar.k0();
                return;
            case 3:
                gq0 gq0Var = (gq0) this.f27440b;
                gq0Var.f26490q = false;
                gq0Var.dismiss();
                return;
            case 4:
                hq0 hq0Var = (hq0) this.f27440b;
                hq0Var.f26874s = false;
                hq0Var.f26873r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == hq0Var.f26871f) {
                    hq0Var.f26871f = null;
                    return;
                }
                return;
            case 5:
                sr0 sr0Var = (sr0) this.f27440b;
                sr0Var.E.setVisibility(8);
                sr0Var.f30666z0.setVisibility(8);
                pr0 pr0Var = sr0Var.L;
                pr0Var.f29558f = null;
                pr0Var.l();
                sr0Var.B0 = null;
                sr0Var.M0 = false;
                return;
            default:
                sr0 sr0Var2 = ((zq0) this.f27440b).d;
                sr0Var2.F.setVisibility(8);
                sr0Var2.G.setVisibility(8);
                sr0Var2.f30665y0.setVisibility(8);
                sr0Var2.B0 = null;
                return;
        }
    }
}
