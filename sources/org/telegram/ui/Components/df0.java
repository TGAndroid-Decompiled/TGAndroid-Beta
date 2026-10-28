package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class df0 extends org.telegram.ui.ActionBar.k {
    public final kf0 f27429x1;

    public df0(kf0 kf0Var, Activity activity) {
        super(activity, null);
        this.f27429x1 = kf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f27429x1).containerView;
        viewGroup.invalidate();
    }
}
