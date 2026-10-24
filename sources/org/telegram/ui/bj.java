package org.telegram.ui;
public final class bj extends eh.b {
    public final int f36087r;
    public final sn f36088s;

    public bj(sn snVar, org.telegram.ui.ActionBar.g6 g6Var, int i10, int i11) {
        super(i10, g6Var);
        this.f36087r = i11;
        this.f36088s = snVar;
    }

    @Override
    public final int a0() {
        int i10;
        int i11;
        switch (this.f36087r) {
            case 0:
                sn snVar = this.f36088s;
                i10 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                if (!fh.c.c(i10, snVar.f41651qa)) {
                    return i0.a.o(snVar.getThemedColor(org.telegram.ui.ActionBar.k6.Sd), 255);
                }
                qn qnVar = snVar.f41651qa;
                if (qnVar != null && !qnVar.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
            default:
                sn snVar2 = this.f36088s;
                i11 = ((org.telegram.ui.ActionBar.o2) snVar2).currentAccount;
                if (!fh.c.c(i11, snVar2.f41651qa)) {
                    return i0.a.o(snVar2.getThemedColor(org.telegram.ui.ActionBar.k6.f21184d6), 255);
                }
                qn qnVar2 = snVar2.f41651qa;
                if (qnVar2 != null && !qnVar2.a()) {
                    a();
                    return i0.a.o(this.d, 216);
                }
                a();
                return this.d;
        }
    }
}
