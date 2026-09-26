package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class fs extends s4.j {
    public final hs F;

    public fs(hs hsVar) {
        this.F = hsVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
