package org.telegram.ui;

import android.view.ViewGroup;
public final class g30 extends f2.l {
    public final c60 F;

    public g30(c60 c60Var) {
        this.F = c60Var;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        c60 c60Var = this.F;
        c60Var.N.invalidate();
        c60Var.X1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) c60Var).containerView;
        viewGroup.invalidate();
        c60.J0(c60Var);
    }
}
