package org.telegram.ui;
public final class bd1 extends org.telegram.ui.ActionBar.k {
    public final dd1 f44046a;

    public bd1(dd1 dd1Var) {
        this.f44046a = dd1Var;
    }

    @Override
    public final void b(int i7) {
        dd1 dd1Var = this.f44046a;
        org.telegram.messenger.ij ijVar = dd1Var.f44963n;
        if (i7 == -1) {
            dd1Var.finishFragment();
        } else if (i7 == 1) {
            if (ijVar != null) {
                ijVar.f23266k.with_my_score = false;
                dd1Var.showDialog(org.telegram.ui.Components.mo0.N0(dd1Var.getParentActivity(), ijVar, null, false, dd1Var.h));
            }
        } else if (i7 == 2) {
            dd1.a0(dd1Var.d, ijVar, dd1Var.getParentActivity(), dd1Var.f44964r, dd1Var.f44961e);
        }
    }
}
