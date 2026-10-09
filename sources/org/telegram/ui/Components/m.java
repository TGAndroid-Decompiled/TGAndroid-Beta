package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m extends s4.j {
    public final e0 F;

    public m(e0 e0Var) {
        this.F = e0Var;
    }

    @Override
    public final void P(s4.d1 d1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
