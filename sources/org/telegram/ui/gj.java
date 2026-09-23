package org.telegram.ui;
public final class gj extends dh.b {
    public final int f33578n;
    public final xn f33579r;

    public gj(xn xnVar, org.telegram.ui.ActionBar.d6 d6Var, int i10, int i11) {
        super(i10, d6Var);
        this.f33578n = i11;
        this.f33579r = xnVar;
    }

    @Override
    public final int H() {
        int i10;
        int i11;
        switch (this.f33578n) {
            case 0:
                xn xnVar = this.f33579r;
                i10 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                if (!eh.b.c(i10, xnVar.f39370ea)) {
                    return i0.a.k(xnVar.getThemedColor(org.telegram.ui.ActionBar.h6.Sd), 255);
                }
                if (xnVar.f39370ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
            default:
                xn xnVar2 = this.f33579r;
                i11 = ((org.telegram.ui.ActionBar.n2) xnVar2).currentAccount;
                if (!eh.b.c(i11, xnVar2.f39370ea)) {
                    return i0.a.k(xnVar2.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6), 255);
                }
                if (xnVar2.f39370ea != null && !org.telegram.ui.ActionBar.h6.I.q()) {
                    return i0.a.k(this.d, 216);
                }
                return this.d;
        }
    }
}
