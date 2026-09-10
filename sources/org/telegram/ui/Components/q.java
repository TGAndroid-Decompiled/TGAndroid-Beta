package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class q extends s4.j {
    public final r F;

    public q(r rVar) {
        this.F = rVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
