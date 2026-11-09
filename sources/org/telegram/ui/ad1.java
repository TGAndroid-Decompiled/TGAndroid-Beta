package org.telegram.ui;
public final class ad1 extends org.telegram.ui.ActionBar.j {
    public final cd1 f43675a;

    public ad1(cd1 cd1Var) {
        this.f43675a = cd1Var;
    }

    @Override
    public final void b(int i7) {
        cd1 cd1Var = this.f43675a;
        org.telegram.messenger.ij ijVar = cd1Var.f44289n;
        if (i7 == -1) {
            cd1Var.finishFragment();
        } else if (i7 == 1) {
            if (ijVar != null) {
                ijVar.f23262k.with_my_score = false;
                cd1Var.showDialog(org.telegram.ui.Components.no0.N0(cd1Var.getParentActivity(), ijVar, null, false, cd1Var.h));
            }
        } else if (i7 == 2) {
            cd1.a0(cd1Var.d, ijVar, cd1Var.getParentActivity(), cd1Var.f44290r, cd1Var.f44287e);
        }
    }
}
