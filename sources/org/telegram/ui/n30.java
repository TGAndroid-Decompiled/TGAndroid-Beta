package org.telegram.ui;

import android.view.ViewGroup;
public final class n30 extends s4.j {
    public final k60 F;

    public n30(k60 k60Var) {
        this.F = k60Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        k60 k60Var = this.F;
        k60Var.Q.invalidate();
        k60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) k60Var).containerView;
        viewGroup.invalidate();
        k60.J0(k60Var);
    }
}
