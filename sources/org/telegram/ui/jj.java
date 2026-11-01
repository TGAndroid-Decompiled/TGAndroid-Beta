package org.telegram.ui;
public final class jj extends wg.b {
    public final int f38400s;
    public final un f38401w;

    public jj(un unVar, org.telegram.ui.ActionBar.p6 p6Var, int i10, int i11) {
        super(i10, p6Var);
        this.f38400s = i11;
        this.f38401w = unVar;
    }

    @Override
    public final int n0() {
        int i10;
        int i11;
        switch (this.f38400s) {
            case 0:
                un unVar = this.f38401w;
                i10 = ((org.telegram.ui.ActionBar.k2) unVar).currentAccount;
                if (!w7.b9.c(i10, unVar.f42288xa)) {
                    return i0.b.o(unVar.getThemedColor(org.telegram.ui.ActionBar.t6.Ge), 255);
                }
                sn snVar = unVar.f42288xa;
                if (snVar != null && !snVar.a()) {
                    a();
                    return i0.b.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f38401w.f42277x.n0();
            default:
                un unVar2 = this.f38401w;
                i11 = ((org.telegram.ui.ActionBar.k2) unVar2).currentAccount;
                if (!w7.b9.c(i11, unVar2.f42288xa)) {
                    return i0.b.o(unVar2.getThemedColor(org.telegram.ui.ActionBar.t6.f20930d6), 255);
                }
                sn snVar2 = unVar2.f42288xa;
                if (snVar2 != null && !snVar2.a()) {
                    a();
                    return i0.b.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
