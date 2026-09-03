package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class n extends f2.l {
    public final f0 F;

    public n(f0 f0Var) {
        this.F = f0Var;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
