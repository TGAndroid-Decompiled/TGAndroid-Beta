package org.telegram.ui;
public final class hq implements org.telegram.ui.Cells.z4, org.telegram.ui.Components.tt0 {
    public final int f45964a;
    public final iq f45965b;

    public hq(iq iqVar, int i3) {
        this.f45964a = i3;
        this.f45965b = iqVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.a5 a5Var, boolean z10) {
        nq nqVar = this.f45965b.d;
        return nqVar.m0(nqVar.f48046a.E(((Integer) a5Var.getTag()).intValue()), !z10, a5Var);
    }

    @Override
    public void l(int i3) {
        boolean z10;
        switch (this.f45964a) {
            case 1:
                nq nqVar = this.f45965b.d;
                if (nqVar.f48083r != null) {
                    int i10 = nqVar.f48080p1;
                    if ((i10 > 0 && i3 == 0) || (i10 == 0 && i3 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nqVar.f48080p1 = i3;
                    if (z10) {
                        gq B0 = nqVar.B0();
                        nqVar.G0();
                        nqVar.F0(B0);
                    }
                    nqVar.f48046a.g(nqVar.P0);
                    return;
                }
                return;
            default:
                this.f45965b.d.f48088s1 = i3 + 1;
                return;
        }
    }

    @Override
    public void p() {
        int i3 = this.f45964a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
