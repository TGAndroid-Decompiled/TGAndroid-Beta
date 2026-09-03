package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class ne0 extends org.telegram.ui.ActionBar.k {
    public final ue0 f29438q1;

    public ne0(ue0 ue0Var, Activity activity) {
        super(activity, null);
        this.f29438q1 = ue0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f29438q1).containerView;
        viewGroup.invalidate();
    }
}
