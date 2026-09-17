package org.telegram.ui.Components;
public final class fb implements o1.f {
    public final int f23860a;
    public final Object f23861b;

    public fb(Object obj, int i10) {
        this.f23860a = i10;
        this.f23861b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.f23860a) {
            case 0:
                oc ocVar = (oc) this.f23861b;
                if (ocVar.d == hVar) {
                    ocVar.d = null;
                    return;
                }
                return;
            case 1:
                bb bbVar = (bb) this.f23861b;
                if (!z10) {
                    bbVar.run();
                    return;
                }
                return;
            case 2:
                wo0 wo0Var = (wo0) this.f23861b;
                wo0Var.f29712q = false;
                wo0Var.dismiss();
                return;
            case 3:
                xo0 xo0Var = (xo0) this.f23861b;
                xo0Var.f29960s = false;
                xo0Var.f29959r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == xo0Var.f29957f) {
                    xo0Var.f29957f = null;
                    return;
                }
                return;
            case 4:
                iq0 iq0Var = (iq0) this.f23861b;
                iq0Var.E.setVisibility(8);
                iq0Var.f25017z0.setVisibility(8);
                fq0 fq0Var = iq0Var.L;
                fq0Var.f23979f = null;
                fq0Var.l();
                iq0Var.B0 = null;
                iq0Var.M0 = false;
                return;
            default:
                iq0 iq0Var2 = ((pp0) this.f23861b).d;
                iq0Var2.F.setVisibility(8);
                iq0Var2.G.setVisibility(8);
                iq0Var2.f25016y0.setVisibility(8);
                iq0Var2.B0 = null;
                return;
        }
    }
}
