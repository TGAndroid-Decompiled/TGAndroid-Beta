package org.telegram.ui;

import android.view.ViewGroup;
public final class l30 extends s4.j {
    public final h60 F;

    public l30(h60 h60Var) {
        this.F = h60Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        h60 h60Var = this.F;
        h60Var.Q.invalidate();
        h60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) h60Var).containerView;
        viewGroup.invalidate();
        h60.J0(h60Var);
    }
}
