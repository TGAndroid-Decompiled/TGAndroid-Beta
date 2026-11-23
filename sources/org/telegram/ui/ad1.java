package org.telegram.ui;
public final class ad1 extends org.telegram.ui.ActionBar.j {
    public final cd1 f45613a;

    public ad1(cd1 cd1Var) {
        this.f45613a = cd1Var;
    }

    @Override
    public final void b(int i7) {
        cd1 cd1Var = this.f45613a;
        org.telegram.messenger.gj gjVar = cd1Var.f46525n;
        if (i7 == -1) {
            cd1Var.finishFragment();
        } else if (i7 == 1) {
            if (gjVar != null) {
                gjVar.f24213k.with_my_score = false;
                cd1Var.showDialog(org.telegram.ui.Components.ap0.O0(cd1Var.getParentActivity(), gjVar, null, false, cd1Var.h));
            }
        } else if (i7 == 2) {
            cd1.a0(cd1Var.d, gjVar, cd1Var.getParentActivity(), cd1Var.f46526r, cd1Var.f46523e);
        }
    }
}
