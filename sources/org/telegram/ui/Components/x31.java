package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class x31 extends s4.j {
    public final i41 F;

    public x31(i41 i41Var) {
        this.F = i41Var;
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
