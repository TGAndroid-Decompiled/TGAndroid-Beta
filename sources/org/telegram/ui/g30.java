package org.telegram.ui;

import android.view.ViewGroup;
public final class g30 extends s4.j {
    public final d60 F;

    public g30(d60 d60Var) {
        this.F = d60Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        d60 d60Var = this.F;
        d60Var.Q.invalidate();
        d60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
        viewGroup.invalidate();
        d60.J0(d60Var);
    }
}
