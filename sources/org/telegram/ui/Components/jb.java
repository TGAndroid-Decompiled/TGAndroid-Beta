package org.telegram.ui.Components;
public final class jb implements o1.f {
    public final int f26311a;
    public final Object f26312b;

    public jb(Object obj, int i10) {
        this.f26311a = i10;
        this.f26312b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f26311a) {
            case 0:
                sc scVar = (sc) this.f26312b;
                if (scVar.d == hVar) {
                    scVar.d = null;
                    return;
                }
                return;
            case 1:
                fb fbVar = (fb) this.f26312b;
                if (!z10) {
                    fbVar.run();
                    return;
                }
                return;
            case 2:
                dl dlVar = (dl) this.f26312b;
                dlVar.f24423i0 = null;
                dlVar.f24424j0 = 1.0f;
                dlVar.k0();
                return;
            case 3:
                wp0 wp0Var = (wp0) this.f26312b;
                wp0Var.f30935q = false;
                wp0Var.dismiss();
                return;
            case 4:
                xp0 xp0Var = (xp0) this.f26312b;
                xp0Var.f31306s = false;
                xp0Var.f31305r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xp0Var.f31303f) {
                    xp0Var.f31303f = null;
                    return;
                }
                return;
            case 5:
                jr0 jr0Var = (jr0) this.f26312b;
                jr0Var.E.setVisibility(8);
                jr0Var.f26490z0.setVisibility(8);
                gr0 gr0Var = jr0Var.L;
                gr0Var.f25411f = null;
                gr0Var.l();
                jr0Var.B0 = null;
                jr0Var.M0 = false;
                return;
            default:
                jr0 jr0Var2 = ((qq0) this.f26312b).d;
                jr0Var2.F.setVisibility(8);
                jr0Var2.G.setVisibility(8);
                jr0Var2.f26489y0.setVisibility(8);
                jr0Var2.B0 = null;
                return;
        }
    }
}
