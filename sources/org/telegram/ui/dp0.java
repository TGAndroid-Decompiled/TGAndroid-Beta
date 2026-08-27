package org.telegram.ui;

public final class dp0 extends org.telegram.ui.ActionBar.j {

    public final jp0 f37489a;

    public dp0(jp0 jp0Var) {
        this.f37489a = jp0Var;
    }

    @Override
    public final void b(int i10) {
        jp0 jp0Var = this.f37489a;
        if (i10 == -1) {
            jp0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 2) {
                jp0.U(jp0Var, null);
            }
        } else if (jp0Var.R != null) {
            jp0Var.finishFragment(false);
            jp0Var.R.b();
        }
    }
}
