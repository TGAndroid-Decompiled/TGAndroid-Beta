package org.telegram.ui;
public final class ij extends dh.b {
    public final int f34593n;
    public final zn f34594r;

    public ij(zn znVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.f34593n = i11;
        this.f34594r = znVar;
    }

    @Override
    public final int H() {
        int i10;
        int i11;
        switch (this.f34593n) {
            case 0:
                zn znVar = this.f34594r;
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                if (!eh.b.c(i10, znVar.f40303ea)) {
                    return i0.a.k(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sd), 255);
                }
                if (znVar.f40303ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                zn znVar2 = this.f34594r;
                i11 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                if (!eh.b.c(i11, znVar2.f40303ea)) {
                    return i0.a.k(znVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19094d6), 255);
                }
                if (znVar2.f40303ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
