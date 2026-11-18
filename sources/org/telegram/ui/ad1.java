package org.telegram.ui;
public final class ad1 extends org.telegram.ui.ActionBar.j {
    public final cd1 f45570a;

    public ad1(cd1 cd1Var) {
        this.f45570a = cd1Var;
    }

    @Override
    public final void b(int i7) {
        cd1 cd1Var = this.f45570a;
        org.telegram.messenger.fj fjVar = cd1Var.f46494n;
        if (i7 == -1) {
            cd1Var.finishFragment();
        } else if (i7 == 1) {
            if (fjVar != null) {
                fjVar.f23965k.with_my_score = false;
                cd1Var.showDialog(org.telegram.ui.Components.yo0.O0(cd1Var.getParentActivity(), fjVar, null, false, cd1Var.h));
            }
        } else if (i7 == 2) {
            cd1.a0(cd1Var.d, fjVar, cd1Var.getParentActivity(), cd1Var.f46495r, cd1Var.f46492e);
        }
    }
}
