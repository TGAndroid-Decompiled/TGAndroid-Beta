package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ds extends s4.j {
    public final fs F;

    public ds(fs fsVar) {
        this.F = fsVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
