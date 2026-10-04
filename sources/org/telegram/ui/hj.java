package org.telegram.ui;
public final class hj extends dh.b {
    public final int f37085n;
    public final yn f37086r;

    public hj(yn ynVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.f37085n = i11;
        this.f37086r = ynVar;
    }

    @Override
    public final int B() {
        int i10;
        int i11;
        switch (this.f37085n) {
            case 0:
                yn ynVar = this.f37086r;
                i10 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                if (!eh.b.c(i10, ynVar.f43299ca)) {
                    return i0.a.k(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.Sd), 255);
                }
                if (ynVar.f43299ca != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                yn ynVar2 = this.f37086r;
                i11 = ((org.telegram.ui.ActionBar.n2) ynVar2).currentAccount;
                if (!eh.b.c(i11, ynVar2.f43299ca)) {
                    return i0.a.k(ynVar2.getThemedColor(org.telegram.ui.ActionBar.i6.f20817d6), 255);
                }
                if (ynVar2.f43299ca != null && !org.telegram.ui.ActionBar.i6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
