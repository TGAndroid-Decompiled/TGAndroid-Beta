package org.telegram.ui.Components;
public final class ya implements o1.f {
    public final int f33444a;
    public final Object f33445b;

    public ya(Object obj, int i10) {
        this.f33444a = i10;
        this.f33445b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f33444a) {
            case 0:
                ic icVar = (ic) this.f33445b;
                if (icVar.d == hVar) {
                    icVar.d = null;
                    return;
                }
                return;
            case 1:
                ua uaVar = (ua) this.f33445b;
                if (!z4) {
                    uaVar.run();
                    return;
                }
                return;
            case 2:
                zo0 zo0Var = (zo0) this.f33445b;
                zo0Var.f33983q = false;
                zo0Var.dismiss();
                return;
            case 3:
                ap0 ap0Var = (ap0) this.f33445b;
                ap0Var.f25344s = false;
                ap0Var.f25343r = false;
                if (!z4) {
                    hVar.c();
                }
                if (hVar == ap0Var.f25341f) {
                    ap0Var.f25341f = null;
                    return;
                }
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f33445b;
                lq0Var.B.setVisibility(8);
                lq0Var.f28854w0.setVisibility(8);
                iq0 iq0Var = lq0Var.I;
                iq0Var.f27887f = null;
                iq0Var.l();
                lq0Var.f28858y0 = null;
                lq0Var.J0 = false;
                return;
            default:
                lq0 lq0Var2 = ((sp0) this.f33445b).d;
                lq0Var2.C.setVisibility(8);
                lq0Var2.D.setVisibility(8);
                lq0Var2.f28852v0.setVisibility(8);
                lq0Var2.f28858y0 = null;
                return;
        }
    }
}
