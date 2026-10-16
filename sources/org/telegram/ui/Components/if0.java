package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class if0 extends org.telegram.ui.ActionBar.k {
    public final pf0 f25636u1;

    public if0(pf0 pf0Var, Activity activity) {
        super(activity, null);
        this.f25636u1 = pf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f25636u1).containerView;
        viewGroup.invalidate();
    }
}
