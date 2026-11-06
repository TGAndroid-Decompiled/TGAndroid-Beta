package org.telegram.ui;
public final class jq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.ut0 {
    public final int f47023a;
    public final kq f47024b;

    public jq(kq kqVar, int i7) {
        this.f47023a = i7;
        this.f47024b = kqVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        oq oqVar = this.f47024b.d;
        return oqVar.m0(oqVar.f48468a.E(((Integer) a5Var.getTag()).intValue()), !z9, a5Var);
    }

    @Override
    public void m(int i7) {
        boolean z9;
        switch (this.f47023a) {
            case 1:
                oq oqVar = this.f47024b.d;
                if (oqVar.f48505r != null) {
                    int i10 = oqVar.f48500o1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    oqVar.f48500o1 = i7;
                    if (z9) {
                        iq B0 = oqVar.B0();
                        oqVar.G0();
                        oqVar.F0(B0);
                    }
                    oqVar.f48468a.g(oqVar.O0);
                    return;
                }
                return;
            default:
                this.f47024b.d.f48507r1 = i7 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i7 = this.f47023a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
