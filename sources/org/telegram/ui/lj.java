package org.telegram.ui;
public final class lj extends ch.b {
    public final int f34726n;
    public final eo f34727r;

    public lj(eo eoVar, org.telegram.ui.ActionBar.f6 f6Var, int i10, int i11) {
        super(i10, f6Var);
        this.f34726n = i11;
        this.f34727r = eoVar;
    }

    @Override
    public final int x() {
        int i10;
        int i11;
        switch (this.f34726n) {
            case 0:
                eo eoVar = this.f34727r;
                i10 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                if (!dh.c.c(i10, eoVar.f32316ea)) {
                    return i0.a.k(eoVar.getThemedColor(org.telegram.ui.ActionBar.j6.Sd), 255);
                }
                if (eoVar.f32316ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                eo eoVar2 = this.f34727r;
                i11 = ((org.telegram.ui.ActionBar.p2) eoVar2).currentAccount;
                if (!dh.c.c(i11, eoVar2.f32316ea)) {
                    return i0.a.k(eoVar2.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6), 255);
                }
                if (eoVar2.f32316ea != null && !org.telegram.ui.ActionBar.j6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
