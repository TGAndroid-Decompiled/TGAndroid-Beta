package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class p extends s4.k {
    public final q F;

    public p(q qVar) {
        this.F = qVar;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
