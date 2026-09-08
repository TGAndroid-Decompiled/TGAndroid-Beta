package org.telegram.ui;

import android.view.ViewGroup;
public final class c40 extends org.telegram.ui.Components.oh0 {
    public final j60 f35019s1;

    public c40(j60 j60Var, LaunchActivity launchActivity, f50 f50Var, p50 p50Var, b40 b40Var) {
        super(launchActivity, f50Var, p50Var, b40Var);
        this.f35019s1 = j60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f35019s1).containerView;
        viewGroup.invalidate();
    }
}
