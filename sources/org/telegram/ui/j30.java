package org.telegram.ui;

import android.view.ViewGroup;
public final class j30 extends org.telegram.ui.Components.li0 {
    public final q50 f38162s1;

    public j30(q50 q50Var, LaunchActivity launchActivity, m40 m40Var, w40 w40Var, i30 i30Var) {
        super(launchActivity, m40Var, w40Var, i30Var);
        this.f38162s1 = q50Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f38162s1).containerView;
        viewGroup.invalidate();
    }
}
