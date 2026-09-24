package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class p extends s4.j {
    public final q F;

    public p(q qVar) {
        this.F = qVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
