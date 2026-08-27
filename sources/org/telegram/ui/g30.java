package org.telegram.ui;

public final class g30 extends f2.l {
    public final s50 F;

    public g30(s50 s50Var) {
        this.F = s50Var;
    }

    @Override
    public final void P(f2.o1 o1Var) {
        s50 s50Var = this.F;
        s50Var.M.invalidate();
        s50Var.W1.invalidate();
        ((org.telegram.ui.ActionBar.e3) s50Var).containerView.invalidate();
        s50.J0(s50Var);
    }
}
