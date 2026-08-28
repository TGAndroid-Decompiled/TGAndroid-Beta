package org.telegram.ui.Components;
public final class ya implements o1.f {
    public final int f34913a;
    public final Object f34914b;

    public ya(Object obj, int i9) {
        this.f34913a = i9;
        this.f34914b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.f34913a) {
            case 0:
                gc gcVar = (gc) this.f34914b;
                if (gcVar.d == hVar) {
                    gcVar.d = null;
                    return;
                }
                return;
            case 1:
                ua uaVar = (ua) this.f34914b;
                if (!z10) {
                    uaVar.run();
                    return;
                }
                return;
            case 2:
                eo0 eo0Var = (eo0) this.f34914b;
                eo0Var.f28093q = false;
                eo0Var.dismiss();
                return;
            case 3:
                fo0 fo0Var = (fo0) this.f34914b;
                fo0Var.f28536s = false;
                fo0Var.f28535r = false;
                if (!z10) {
                    hVar.c();
                }
                if (hVar == fo0Var.f28533f) {
                    fo0Var.f28533f = null;
                    return;
                }
                return;
            case 4:
                rp0 rp0Var = (rp0) this.f34914b;
                rp0Var.A.setVisibility(8);
                rp0Var.f32268v0.setVisibility(8);
                op0 op0Var = rp0Var.H;
                op0Var.f31423f = null;
                op0Var.l();
                rp0Var.f32272x0 = null;
                rp0Var.I0 = false;
                return;
            default:
                rp0 rp0Var2 = ((yo0) this.f34914b).d;
                rp0Var2.B.setVisibility(8);
                rp0Var2.C.setVisibility(8);
                rp0Var2.f32267u0.setVisibility(8);
                rp0Var2.f32272x0 = null;
                return;
        }
    }
}
