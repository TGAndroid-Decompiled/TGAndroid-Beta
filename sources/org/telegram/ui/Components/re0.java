package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class re0 extends org.telegram.ui.ActionBar.k {
    public final ye0 f27879u1;

    public re0(ye0 ye0Var, Activity activity) {
        super(activity, null);
        this.f27879u1 = ye0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27879u1).containerView;
        viewGroup.invalidate();
    }
}
