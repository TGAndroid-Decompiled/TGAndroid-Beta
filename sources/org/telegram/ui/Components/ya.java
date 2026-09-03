package org.telegram.ui.Components;
public final class ya implements o1.f {
    public final int f30969a;
    public final Object f30970b;

    public ya(Object obj, int i10) {
        this.f30969a = i10;
        this.f30970b = obj;
    }

    @Override
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.f30969a) {
            case 0:
                ic icVar = (ic) this.f30970b;
                if (icVar.d == hVar) {
                    icVar.d = null;
                    return;
                }
                return;
            case 1:
                ua uaVar = (ua) this.f30970b;
                if (!z4) {
                    uaVar.run();
                    return;
                }
                return;
            case 2:
                yo0 yo0Var = (yo0) this.f30970b;
                yo0Var.f31086q = false;
                yo0Var.dismiss();
                return;
            case 3:
                zo0 zo0Var = (zo0) this.f30970b;
                zo0Var.f31446s = false;
                zo0Var.f31445r = false;
                if (!z4) {
                    hVar.c();
                }
                if (hVar == zo0Var.f31443f) {
                    zo0Var.f31443f = null;
                    return;
                }
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f30970b;
                lq0Var.B.setVisibility(8);
                lq0Var.f26860w0.setVisibility(8);
                iq0 iq0Var = lq0Var.I;
                iq0Var.f25756f = null;
                iq0Var.l();
                lq0Var.f26864y0 = null;
                lq0Var.J0 = false;
                return;
            default:
                lq0 lq0Var2 = ((rp0) this.f30970b).d;
                lq0Var2.C.setVisibility(8);
                lq0Var2.D.setVisibility(8);
                lq0Var2.f26858v0.setVisibility(8);
                lq0Var2.f26864y0 = null;
                return;
        }
    }
}
