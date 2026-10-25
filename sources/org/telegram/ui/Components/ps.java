package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ps extends s4.l {
    public final rs F;

    public ps(rs rsVar) {
        this.F = rsVar;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.F).containerView;
        viewGroup.invalidate();
    }
}
