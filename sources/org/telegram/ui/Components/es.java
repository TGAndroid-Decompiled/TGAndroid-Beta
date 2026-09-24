package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class es extends s4.j {
    public final gs F;

    public es(gs gsVar) {
        this.F = gsVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
