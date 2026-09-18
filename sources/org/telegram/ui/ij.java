package org.telegram.ui;
public final class ij extends dh.b {
    public final int f34539n;
    public final zn f34540r;

    public ij(zn znVar, org.telegram.ui.ActionBar.e6 e6Var, int i10, int i11) {
        super(i10, e6Var);
        this.f34539n = i11;
        this.f34540r = znVar;
    }

    @Override
    public final int H() {
        int i10;
        int i11;
        switch (this.f34539n) {
            case 0:
                zn znVar = this.f34540r;
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                if (!eh.b.c(i10, znVar.f40261ea)) {
                    return i0.a.k(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sd), 255);
                }
                if (znVar.f40261ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                zn znVar2 = this.f34540r;
                i11 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                if (!eh.b.c(i11, znVar2.f40261ea)) {
                    return i0.a.k(znVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6), 255);
                }
                if (znVar2.f40261ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
