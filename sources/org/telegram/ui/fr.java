package org.telegram.ui;
public final class fr implements org.telegram.ui.Cells.e5, org.telegram.ui.Components.yw0 {
    public final int f39438a;
    public final gr f39439b;

    public fr(gr grVar, int i10) {
        this.f39438a = i10;
        this.f39439b = grVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        kr krVar = this.f39439b.d;
        return krVar.i0(krVar.f41004a.E(((Integer) f5Var.getTag()).intValue()), !z10, f5Var);
    }

    @Override
    public void j(int i10) {
        boolean z10;
        switch (this.f39438a) {
            case 1:
                kr krVar = this.f39439b.d;
                if (krVar.f41041r != null) {
                    int i11 = krVar.f41036o1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    krVar.f41036o1 = i10;
                    if (z10) {
                        er x02 = krVar.x0();
                        krVar.C0();
                        krVar.B0(x02);
                    }
                    krVar.f41004a.m(krVar.O0);
                    return;
                }
                return;
            default:
                this.f39439b.d.f41043r1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f39438a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
