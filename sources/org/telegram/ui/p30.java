package org.telegram.ui;

import android.view.ViewGroup;
public final class p30 extends s4.k {
    public final n60 F;

    public p30(n60 n60Var) {
        this.F = n60Var;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        n60 n60Var = this.F;
        n60Var.Q.invalidate();
        n60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) n60Var).containerView;
        viewGroup.invalidate();
        n60.K0(n60Var);
    }
}
