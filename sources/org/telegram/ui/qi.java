package org.telegram.ui;
public final class qi extends gh.b {
    public final int f49048s;
    public final cn f49049w;

    public qi(cn cnVar, org.telegram.ui.ActionBar.h6 h6Var, int i7, int i10) {
        super(i7, h6Var);
        this.f49048s = i10;
        this.f49049w = cnVar;
    }

    @Override
    public final int e1() {
        int i7;
        int i10;
        switch (this.f49048s) {
            case 0:
                cn cnVar = this.f49049w;
                i7 = ((org.telegram.ui.ActionBar.f2) cnVar).currentAccount;
                if (!c8.g0.c(i7, cnVar.f44750za)) {
                    return i0.a.o(cnVar.getThemedColor(org.telegram.ui.ActionBar.m6.Ge), 255);
                }
                an anVar = cnVar.f44750za;
                if (anVar != null && !anVar.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            case 1:
                return this.f49049w.f44715x.e1();
            default:
                cn cnVar2 = this.f49049w;
                i10 = ((org.telegram.ui.ActionBar.f2) cnVar2).currentAccount;
                if (!c8.g0.c(i10, cnVar2.f44750za)) {
                    return i0.a.o(cnVar2.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6), 255);
                }
                an anVar2 = cnVar2.f44750za;
                if (anVar2 != null && !anVar2.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
