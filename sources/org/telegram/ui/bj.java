package org.telegram.ui;
public final class bj extends eh.b {
    public final int f35644n;
    public final qn f35645r;

    public bj(qn qnVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.f35644n = i11;
        this.f35645r = qnVar;
    }

    @Override
    public final int a0() {
        int i10;
        int i11;
        switch (this.f35644n) {
            case 0:
                qn qnVar = this.f35645r;
                i10 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                if (!fh.c.c(i10, qnVar.f40673ea)) {
                    return i0.a.o(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Sd), 255);
                }
                if (qnVar.f40673ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.o(this.d, 216);
                }
                return this.d;
            default:
                qn qnVar2 = this.f35645r;
                i11 = ((org.telegram.ui.ActionBar.n2) qnVar2).currentAccount;
                if (!fh.c.c(i11, qnVar2.f40673ea)) {
                    return i0.a.o(qnVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f20990d6), 255);
                }
                if (qnVar2.f40673ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.o(this.d, 216);
                }
                return this.d;
        }
    }
}
