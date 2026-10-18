package org.telegram.ui;

import android.view.ViewGroup;
public final class l30 extends org.telegram.ui.Components.ki0 {
    public final s50 f38678s1;

    public l30(s50 s50Var, LaunchActivity launchActivity, o40 o40Var, y40 y40Var, k30 k30Var) {
        super(launchActivity, o40Var, y40Var, k30Var);
        this.f38678s1 = s50Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f38678s1).containerView;
        viewGroup.invalidate();
    }
}
