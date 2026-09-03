package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class j31 extends f2.l {
    public final v31 F;

    public j31(v31 v31Var) {
        this.F = v31Var;
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void P(f2.m1 m1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
