package org.telegram.ui;
public final class jj extends wg.b {
    public final int f38534s;
    public final un f38535w;

    public jj(un unVar, org.telegram.ui.ActionBar.p6 p6Var, int i10, int i11) {
        super(i10, p6Var);
        this.f38534s = i11;
        this.f38535w = unVar;
    }

    @Override
    public final int n0() {
        int i10;
        int i11;
        switch (this.f38534s) {
            case 0:
                un unVar = this.f38535w;
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                if (!w7.b9.c(i10, unVar.f42477xa)) {
                    return i0.b.o(unVar.getThemedColor(org.telegram.ui.ActionBar.t6.Ge), 255);
                }
                sn snVar = unVar.f42477xa;
                if (snVar != null && !snVar.a()) {
                    a();
                    return i0.b.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f38535w.f42466x.n0();
            default:
                un unVar2 = this.f38535w;
                i11 = ((org.telegram.ui.ActionBar.k2) unVar2).currentAccount;
                if (!w7.b9.c(i11, unVar2.f42477xa)) {
                    return i0.b.o(unVar2.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6), 255);
                }
                sn snVar2 = unVar2.f42477xa;
                if (snVar2 != null && !snVar2.a()) {
                    a();
                    return i0.b.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
