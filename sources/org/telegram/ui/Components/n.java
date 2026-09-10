package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class n extends s4.j {
    public final g0 F;

    public n(g0 g0Var) {
        this.F = g0Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
