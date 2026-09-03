package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class w extends f2.l {
    public final z F;

    public w(z zVar) {
        this.F = zVar;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
