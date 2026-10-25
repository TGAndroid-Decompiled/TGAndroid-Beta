package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m extends s4.l {
    public final e0 F;

    public m(e0 e0Var) {
        this.F = e0Var;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.F).containerView;
        viewGroup.invalidate();
    }
}
