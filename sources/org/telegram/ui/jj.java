package org.telegram.ui;
public final class jj extends dh.b {
    public final int f34960n;
    public final zn f34961r;

    public jj(zn znVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.f34960n = i11;
        this.f34961r = znVar;
    }

    @Override
    public final int H() {
        int i10;
        int i11;
        switch (this.f34960n) {
            case 0:
                zn znVar = this.f34961r;
                i10 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                if (!eh.b.c(i10, znVar.f40324ea)) {
                    return i0.a.k(znVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sd), 255);
                }
                if (znVar.f40324ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                zn znVar2 = this.f34961r;
                i11 = ((org.telegram.ui.ActionBar.n2) znVar2).currentAccount;
                if (!eh.b.c(i11, znVar2.f40324ea)) {
                    return i0.a.k(znVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6), 255);
                }
                if (znVar2.f40324ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
