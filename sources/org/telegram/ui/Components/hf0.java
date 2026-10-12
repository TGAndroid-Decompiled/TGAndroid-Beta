package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class hf0 extends org.telegram.ui.ActionBar.k {
    public final of0 f25660u1;

    public hf0(of0 of0Var, Activity activity) {
        super(activity, null);
        this.f25660u1 = of0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f25660u1).containerView;
        viewGroup.invalidate();
    }
}
