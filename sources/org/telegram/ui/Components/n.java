package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class n extends s4.j {
    public final f0 F;

    public n(f0 f0Var) {
        this.F = f0Var;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
