package org.telegram.ui.Components;
public final class sa implements q1.c {
    public final int f37955a;
    public final Object f37956b;

    public sa(Object obj, int i3) {
        this.f37955a = i3;
        this.f37956b = obj;
    }

    @Override
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.f37955a) {
            case 0:
                ac acVar = (ac) this.f37956b;
                if (acVar.d == gVar) {
                    acVar.d = null;
                    return;
                }
                return;
            case 1:
                oa oaVar = (oa) this.f37956b;
                if (!z10) {
                    oaVar.run();
                    return;
                }
                return;
            case 2:
                hk hkVar = (hk) this.f37956b;
                hkVar.m0 = null;
                hkVar.f34417n0 = 1.0f;
                hkVar.m0();
                return;
            case 3:
                en0 en0Var = (en0) this.f37956b;
                en0Var.f33423q = false;
                en0Var.dismiss();
                return;
            case 4:
                fn0 fn0Var = (fn0) this.f37956b;
                fn0Var.f33829s = false;
                fn0Var.f33828r = false;
                if (!z10) {
                    gVar.d();
                }
                if (gVar == fn0Var.f33826f) {
                    fn0Var.f33826f = null;
                    return;
                }
                return;
            case 5:
                oo0 oo0Var = (oo0) this.f37956b;
                oo0Var.f36909x1.setVisibility(8);
                oo0Var.f36900s2.setVisibility(8);
                mo0 mo0Var = oo0Var.E1;
                mo0Var.f36223f = null;
                mo0Var.f();
                oo0Var.f36904u2 = null;
                oo0Var.F2 = false;
                return;
            default:
                oo0 oo0Var2 = ((xn0) this.f37956b).d;
                oo0Var2.f36911y1.setVisibility(8);
                oo0Var2.f36913z1.setVisibility(8);
                oo0Var2.f36898r2.setVisibility(8);
                oo0Var2.f36904u2 = null;
                return;
        }
    }
}
