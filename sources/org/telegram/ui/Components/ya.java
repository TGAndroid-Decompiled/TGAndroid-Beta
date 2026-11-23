package org.telegram.ui.Components;
public final class ya implements r1.c {
    public final int f42349a;
    public final Object f42350b;

    public ya(Object obj, int i7) {
        this.f42349a = i7;
        this.f42350b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f42349a) {
            case 0:
                gc gcVar = (gc) this.f42350b;
                if (gcVar.d == gVar) {
                    gcVar.d = null;
                    return;
                }
                return;
            case 1:
                ua uaVar = (ua) this.f42350b;
                if (!z10) {
                    uaVar.run();
                    return;
                }
                return;
            case 2:
                zk zkVar = (zk) this.f42350b;
                zkVar.m0 = null;
                zkVar.f42875n0 = 1.0f;
                zkVar.m0();
                return;
            case 3:
                qn0 qn0Var = (qn0) this.f42350b;
                qn0Var.f38910q = false;
                qn0Var.dismiss();
                return;
            case 4:
                rn0 rn0Var = (rn0) this.f42350b;
                rn0Var.f39250s = false;
                rn0Var.f39249r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == rn0Var.f39247f) {
                    rn0Var.f39247f = null;
                    return;
                }
                return;
            case 5:
                ap0 ap0Var = (ap0) this.f42350b;
                ap0Var.A1.setVisibility(8);
                ap0Var.f33575v2.setVisibility(8);
                yo0 yo0Var = ap0Var.H1;
                yo0Var.f42446f = null;
                yo0Var.f();
                ap0Var.f33579x2 = null;
                ap0Var.I2 = false;
                return;
            default:
                ap0 ap0Var2 = ((jo0) this.f42350b).d;
                ap0Var2.B1.setVisibility(8);
                ap0Var2.C1.setVisibility(8);
                ap0Var2.f33573u2.setVisibility(8);
                ap0Var2.f33579x2 = null;
                return;
        }
    }
}
