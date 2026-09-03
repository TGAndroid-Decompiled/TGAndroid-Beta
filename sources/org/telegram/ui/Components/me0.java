package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class me0 extends org.telegram.ui.ActionBar.k {
    public final te0 f27020q1;

    public me0(te0 te0Var, Activity activity) {
        super(activity, null);
        this.f27020q1 = te0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f27020q1).containerView;
        viewGroup.invalidate();
    }
}
