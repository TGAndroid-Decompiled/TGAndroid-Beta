package org.telegram.ui;
public final class fj extends qg.b {
    public final int f34268n;
    public final xn f34269r;

    public fj(xn xnVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.f34268n = i11;
        this.f34269r = xnVar;
    }

    @Override
    public final int D2() {
        int i10;
        int i11;
        switch (this.f34268n) {
            case 0:
                xn xnVar = this.f34269r;
                i10 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                if (!rg.b.c(i10, xnVar.f39968ba)) {
                    return i0.a.k(xnVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sd), 255);
                }
                if (xnVar.f39968ba != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                xn xnVar2 = this.f34269r;
                i11 = ((org.telegram.ui.ActionBar.p2) xnVar2).currentAccount;
                if (!rg.b.c(i11, xnVar2.f39968ba)) {
                    return i0.a.k(xnVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6), 255);
                }
                if (xnVar2.f39968ba != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
