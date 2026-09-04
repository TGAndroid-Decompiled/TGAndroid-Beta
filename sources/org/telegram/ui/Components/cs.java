package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class cs extends s4.j {
    public final es F;

    public cs(es esVar) {
        this.F = esVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
