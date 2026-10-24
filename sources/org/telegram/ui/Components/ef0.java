package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class ef0 extends org.telegram.ui.ActionBar.k {
    public final lf0 f26030v1;

    public ef0(lf0 lf0Var, Activity activity) {
        super(activity, null);
        this.f26030v1 = lf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f26030v1).containerView;
        viewGroup.invalidate();
    }
}
