package org.telegram.ui.Components;
public final class fb implements o1.f {
    public final int f23863a;
    public final Object f23864b;

    public fb(Object obj, int i10) {
        this.f23863a = i10;
        this.f23864b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23863a) {
            case 0:
                oc ocVar = (oc) this.f23864b;
                if (ocVar.d == hVar) {
                    ocVar.d = null;
                    return;
                }
                return;
            case 1:
                bb bbVar = (bb) this.f23864b;
                if (!z10) {
                    bbVar.run();
                    return;
                }
                return;
            case 2:
                wo0 wo0Var = (wo0) this.f23864b;
                wo0Var.f29715q = false;
                wo0Var.dismiss();
                return;
            case 3:
                xo0 xo0Var = (xo0) this.f23864b;
                xo0Var.f29963s = false;
                xo0Var.f29962r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xo0Var.f29960f) {
                    xo0Var.f29960f = null;
                    return;
                }
                return;
            case 4:
                iq0 iq0Var = (iq0) this.f23864b;
                iq0Var.E.setVisibility(8);
                iq0Var.f25020z0.setVisibility(8);
                fq0 fq0Var = iq0Var.L;
                fq0Var.f23982f = null;
                fq0Var.l();
                iq0Var.B0 = null;
                iq0Var.M0 = false;
                return;
            default:
                iq0 iq0Var2 = ((pp0) this.f23864b).d;
                iq0Var2.F.setVisibility(8);
                iq0Var2.G.setVisibility(8);
                iq0Var2.f25019y0.setVisibility(8);
                iq0Var2.B0 = null;
                return;
        }
    }
}
