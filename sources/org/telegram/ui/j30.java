package org.telegram.ui;

import android.view.ViewGroup;
public final class j30 extends s4.j {
    public final g60 F;

    public j30(g60 g60Var) {
        this.F = g60Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        g60 g60Var = this.F;
        g60Var.Q.invalidate();
        g60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) g60Var).containerView;
        viewGroup.invalidate();
        g60.J0(g60Var);
    }
}
