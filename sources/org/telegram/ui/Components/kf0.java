package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class kf0 extends org.telegram.ui.ActionBar.k {
    public final rf0 f28058u1;

    public kf0(rf0 rf0Var, Activity activity) {
        super(activity, null);
        this.f28058u1 = rf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f28058u1).containerView;
        viewGroup.invalidate();
    }
}
