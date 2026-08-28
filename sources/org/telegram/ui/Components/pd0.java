package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class pd0 extends org.telegram.ui.ActionBar.k {
    public final wd0 f31616p1;

    public pd0(wd0 wd0Var, Activity activity) {
        super(activity, null);
        this.f31616p1 = wd0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f31616p1).containerView;
        viewGroup.invalidate();
    }
}
