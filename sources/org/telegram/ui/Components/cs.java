package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class cs extends f2.l {
    public final es F;

    public cs(es esVar) {
        this.F = esVar;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
