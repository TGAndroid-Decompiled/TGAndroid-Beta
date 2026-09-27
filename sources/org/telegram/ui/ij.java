package org.telegram.ui;
public final class ij extends dh.b {
    public final int f34494n;
    public final xn f34495r;

    public ij(xn xnVar, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(i10, e6Var);
        this.f34494n = i11;
        this.f34495r = xnVar;
    }

    @Override
    public final int B() {
        int i10;
        int i11;
        switch (this.f34494n) {
            case 0:
                xn xnVar = this.f34495r;
                i10 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                if (!eh.b.c(i10, xnVar.f39750ea)) {
                    return i0.a.k(xnVar.getThemedColor(org.telegram.ui.ActionBar.i6.Sd), 255);
                }
                if (xnVar.f39750ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                xn xnVar2 = this.f34495r;
                i11 = ((org.telegram.ui.ActionBar.o2) xnVar2).currentAccount;
                if (!eh.b.c(i11, xnVar2.f39750ea)) {
                    return i0.a.k(xnVar2.getThemedColor(org.telegram.ui.ActionBar.i6.f19057d6), 255);
                }
                if (xnVar2.f39750ea != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
