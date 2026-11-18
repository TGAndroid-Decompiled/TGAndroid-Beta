package org.telegram.ui.Components;
public final class ya implements r1.c {
    public final int f42433a;
    public final Object f42434b;

    public ya(Object obj, int i7) {
        this.f42433a = i7;
        this.f42434b = obj;
    }

    @Override
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f42433a) {
            case 0:
                gc gcVar = (gc) this.f42434b;
                if (gcVar.d == gVar) {
                    gcVar.d = null;
                    return;
                }
                return;
            case 1:
                ua uaVar = (ua) this.f42434b;
                if (!z10) {
                    uaVar.run();
                    return;
                }
                return;
            case 2:
                xk xkVar = (xk) this.f42434b;
                xkVar.m0 = null;
                xkVar.f42119n0 = 1.0f;
                xkVar.m0();
                return;
            case 3:
                on0 on0Var = (on0) this.f42434b;
                on0Var.f38138q = false;
                on0Var.dismiss();
                return;
            case 4:
                pn0 pn0Var = (pn0) this.f42434b;
                pn0Var.f38502s = false;
                pn0Var.f38501r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == pn0Var.f38499f) {
                    pn0Var.f38499f = null;
                    return;
                }
                return;
            case 5:
                yo0 yo0Var = (yo0) this.f42434b;
                yo0Var.A1.setVisibility(8);
                yo0Var.f42582v2.setVisibility(8);
                wo0 wo0Var = yo0Var.H1;
                wo0Var.f41747f = null;
                wo0Var.f();
                yo0Var.f42586x2 = null;
                yo0Var.I2 = false;
                return;
            default:
                yo0 yo0Var2 = ((ho0) this.f42434b).d;
                yo0Var2.B1.setVisibility(8);
                yo0Var2.C1.setVisibility(8);
                yo0Var2.f42580u2.setVisibility(8);
                yo0Var2.f42586x2 = null;
                return;
        }
    }
}
