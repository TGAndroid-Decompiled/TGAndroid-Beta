package org.telegram.ui.Components;
public final class jb implements o1.f {
    public final int f27702a;
    public final Object f27703b;

    public jb(Object obj, int i10) {
        this.f27702a = i10;
        this.f27703b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f27702a) {
            case 0:
                sc scVar = (sc) this.f27703b;
                if (scVar.d == hVar) {
                    scVar.d = null;
                    return;
                }
                return;
            case 1:
                fb fbVar = (fb) this.f27703b;
                if (!z10) {
                    fbVar.run();
                    return;
                }
                return;
            case 2:
                gl glVar = (gl) this.f27703b;
                glVar.f26794i0 = null;
                glVar.f26795j0 = 1.0f;
                glVar.k0();
                return;
            case 3:
                bq0 bq0Var = (bq0) this.f27703b;
                bq0Var.f25064q = false;
                bq0Var.dismiss();
                return;
            case 4:
                cq0 cq0Var = (cq0) this.f27703b;
                cq0Var.f25447s = false;
                cq0Var.f25446r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == cq0Var.f25444f) {
                    cq0Var.f25444f = null;
                    return;
                }
                return;
            case 5:
                nr0 nr0Var = (nr0) this.f27703b;
                nr0Var.E.setVisibility(8);
                nr0Var.f29266z0.setVisibility(8);
                kr0 kr0Var = nr0Var.L;
                kr0Var.f28128f = null;
                kr0Var.l();
                nr0Var.B0 = null;
                nr0Var.M0 = false;
                return;
            default:
                nr0 nr0Var2 = ((uq0) this.f27703b).d;
                nr0Var2.F.setVisibility(8);
                nr0Var2.G.setVisibility(8);
                nr0Var2.f29265y0.setVisibility(8);
                nr0Var2.B0 = null;
                return;
        }
    }
}
