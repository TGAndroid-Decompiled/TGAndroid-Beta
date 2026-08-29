package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class z21 extends f2.l {
    public final k31 F;

    public z21(k31 k31Var) {
        this.F = k31Var;
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
