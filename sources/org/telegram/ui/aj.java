package org.telegram.ui;
public final class aj extends og.b {
    public final int f36561n;
    public final tn f36562r;

    public aj(tn tnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10, int i11) {
        super(i10, c6Var);
        this.f36561n = i11;
        this.f36562r = tnVar;
    }

    @Override
    public final int z() {
        int i10;
        int i11;
        switch (this.f36561n) {
            case 0:
                tn tnVar = this.f36562r;
                i10 = ((org.telegram.ui.ActionBar.o2) tnVar).currentAccount;
                if (!pg.a.c(i10, tnVar.f42746aa)) {
                    return i0.a.k(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.Sd), 255);
                }
                if (tnVar.f42746aa != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                tn tnVar2 = this.f36562r;
                i11 = ((org.telegram.ui.ActionBar.o2) tnVar2).currentAccount;
                if (!pg.a.c(i11, tnVar2.f42746aa)) {
                    return i0.a.k(tnVar2.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6), 255);
                }
                if (tnVar2.f42746aa != null && !org.telegram.ui.ActionBar.g6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
