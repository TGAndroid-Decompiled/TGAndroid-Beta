package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ur extends f2.n {
    public final wr F;

    public ur(wr wrVar) {
        this.F = wrVar;
    }

    @Override
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
