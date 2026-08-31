package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class es extends f2.l {
    public final gs F;

    public es(gs gsVar) {
        this.F = gsVar;
    }

    @Override
    public final void P(f2.m1 m1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
