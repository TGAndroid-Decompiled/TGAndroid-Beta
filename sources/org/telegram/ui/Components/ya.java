package org.telegram.ui.Components;
public final class ya implements o1.f {
    public final int f30952a;
    public final Object f30953b;

    public ya(Object obj, int i10) {
        this.f30952a = i10;
        this.f30953b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f30952a) {
            case 0:
                ic icVar = (ic) this.f30953b;
                if (icVar.d == hVar) {
                    icVar.d = null;
                    return;
                }
                return;
            case 1:
                ua uaVar = (ua) this.f30953b;
                if (!z4) {
                    uaVar.run();
                    return;
                }
                return;
            case 2:
                zo0 zo0Var = (zo0) this.f30953b;
                zo0Var.f31415q = false;
                zo0Var.dismiss();
                return;
            case 3:
                ap0 ap0Var = (ap0) this.f30953b;
                ap0Var.f23491s = false;
                ap0Var.f23490r = false;
                if (!z4) {
                    hVar.c();
                }
                if (hVar == ap0Var.f23488f) {
                    ap0Var.f23488f = null;
                    return;
                }
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f30953b;
                lq0Var.B.setVisibility(8);
                lq0Var.f26870w0.setVisibility(8);
                iq0 iq0Var = lq0Var.I;
                iq0Var.f25775f = null;
                iq0Var.l();
                lq0Var.f26874y0 = null;
                lq0Var.J0 = false;
                return;
            default:
                lq0 lq0Var2 = ((sp0) this.f30953b).d;
                lq0Var2.C.setVisibility(8);
                lq0Var2.D.setVisibility(8);
                lq0Var2.f26868v0.setVisibility(8);
                lq0Var2.f26874y0 = null;
                return;
        }
    }
}
