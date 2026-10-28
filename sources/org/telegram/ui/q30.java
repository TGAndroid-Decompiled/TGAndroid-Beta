package org.telegram.ui;

import android.view.ViewGroup;
public final class q30 extends org.telegram.ui.Components.oi0 {
    public final x50 f42608s1;

    public q30(x50 x50Var, LaunchActivity launchActivity, t40 t40Var, d50 d50Var, p30 p30Var) {
        super(launchActivity, t40Var, d50Var, p30Var);
        this.f42608s1 = x50Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f42608s1).containerView;
        viewGroup.invalidate();
    }
}
