package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class qe0 extends org.telegram.ui.ActionBar.k {
    public final xe0 f27568u1;

    public qe0(xe0 xe0Var, Activity activity) {
        super(activity, null);
        this.f27568u1 = xe0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27568u1).containerView;
        viewGroup.invalidate();
    }
}
