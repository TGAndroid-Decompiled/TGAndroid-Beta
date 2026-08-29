package org.telegram.ui;

import android.view.ViewGroup;
public final class l30 extends org.telegram.ui.Components.kh0 {
    public final r50 f40082o1;

    public l30(r50 r50Var, LaunchActivity launchActivity, n40 n40Var, x40 x40Var, k30 k30Var) {
        super(launchActivity, n40Var, x40Var, k30Var);
        this.f40082o1 = r50Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f40082o1).containerView;
        viewGroup.invalidate();
    }
}
