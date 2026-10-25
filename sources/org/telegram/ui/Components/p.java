package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class p extends s4.l {
    public final q F;

    public p(q qVar) {
        this.F = qVar;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.F).containerView;
        viewGroup.invalidate();
    }
}
