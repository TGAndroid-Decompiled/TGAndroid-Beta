package org.telegram.ui;

import android.view.ViewGroup;
public final class i30 extends org.telegram.ui.Components.ah0 {
    public final o50 f39000o1;

    public i30(o50 o50Var, LaunchActivity launchActivity, k40 k40Var, u40 u40Var, h30 h30Var) {
        super(launchActivity, k40Var, u40Var, h30Var);
        this.f39000o1 = o50Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f39000o1).containerView;
        viewGroup.invalidate();
    }
}
