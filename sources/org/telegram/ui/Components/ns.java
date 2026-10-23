package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ns extends s4.k {
    public final ps F;

    public ns(ps psVar) {
        this.F = psVar;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
