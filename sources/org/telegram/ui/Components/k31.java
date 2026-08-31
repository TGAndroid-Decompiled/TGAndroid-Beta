package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class k31 extends f2.l {
    public final w31 F;

    public k31(w31 w31Var) {
        this.F = w31Var;
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
