package org.telegram.ui;
public final class fr implements org.telegram.ui.Cells.e5, org.telegram.ui.Components.yw0 {
    public final int f39435a;
    public final gr f39436b;

    public fr(gr grVar, int i10) {
        this.f39435a = i10;
        this.f39436b = grVar;
    }

    @Override
    public boolean b(org.telegram.ui.Cells.f5 f5Var, boolean z10) {
        kr krVar = this.f39436b.d;
        return krVar.i0(krVar.f41001a.E(((Integer) f5Var.getTag()).intValue()), !z10, f5Var);
    }

    @Override
    public void j(int i10) {
        boolean z10;
        switch (this.f39435a) {
            case 1:
                kr krVar = this.f39436b.d;
                if (krVar.f41038r != null) {
                    int i11 = krVar.f41033o1;
                    if ((i11 > 0 && i10 == 0) || (i11 == 0 && i10 > 0)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    krVar.f41033o1 = i10;
                    if (z10) {
                        er x02 = krVar.x0();
                        krVar.C0();
                        krVar.B0(x02);
                    }
                    krVar.f41001a.m(krVar.O0);
                    return;
                }
                return;
            default:
                this.f39436b.d.f41040r1 = i10 + 1;
                return;
        }
    }

    @Override
    public void m() {
        int i10 = this.f39435a;
    }

    private final void a() {
    }

    private final void c() {
    }
}
