package org.telegram.ui;

import android.view.ViewGroup;
public final class l30 extends s4.j {
    public final i60 F;

    public l30(i60 i60Var) {
        this.F = i60Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        i60 i60Var = this.F;
        i60Var.Q.invalidate();
        i60Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) i60Var).containerView;
        viewGroup.invalidate();
        i60.J0(i60Var);
    }
}
