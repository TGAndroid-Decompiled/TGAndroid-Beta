package org.telegram.ui;

import android.view.ViewGroup;
public final class d40 extends org.telegram.ui.Components.yh0 {
    public final j60 f31824s1;

    public d40(j60 j60Var, LaunchActivity launchActivity, f50 f50Var, p50 p50Var, c40 c40Var) {
        super(launchActivity, f50Var, p50Var, c40Var);
        this.f31824s1 = j60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f31824s1).containerView;
        viewGroup.invalidate();
    }
}
