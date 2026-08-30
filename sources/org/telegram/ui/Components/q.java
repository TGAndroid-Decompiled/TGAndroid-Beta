package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class q extends f2.l {
    public final r F;

    public q(r rVar) {
        this.F = rVar;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
