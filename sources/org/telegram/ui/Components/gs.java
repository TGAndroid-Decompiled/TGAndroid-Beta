package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class gs extends s4.j {
    public final is F;

    public gs(is isVar) {
        this.F = isVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
