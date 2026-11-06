package org.telegram.ui;
public final class jq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.ut0 {
    public final int f46999a;
    public final kq f47000b;

    public jq(kq kqVar, int i7) {
        this.f46999a = i7;
        this.f47000b = kqVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z9) {
        oq oqVar = this.f47000b.d;
        return oqVar.m0(oqVar.f48441a.E(((Integer) a5Var.getTag()).intValue()), !z9, a5Var);
    }

    @Override
    public void m(int i7) {
        boolean z9;
        switch (this.f46999a) {
            case 1:
                oq oqVar = this.f47000b.d;
                if (oqVar.f48478r != null) {
                    int i10 = oqVar.f48473o1;
                    if ((i10 > 0 && i7 == 0) || (i10 == 0 && i7 > 0)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    oqVar.f48473o1 = i7;
                    if (z9) {
                        iq B0 = oqVar.B0();
                        oqVar.G0();
                        oqVar.F0(B0);
                    }
                    oqVar.f48441a.g(oqVar.O0);
                    return;
                }
                return;
            default:
                this.f47000b.d.f48480r1 = i7 + 1;
                return;
        }
    }

    @Override
    public void n() {
        int i7 = this.f46999a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
