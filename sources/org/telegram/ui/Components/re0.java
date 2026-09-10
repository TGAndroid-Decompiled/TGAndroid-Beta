package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class re0 extends org.telegram.ui.ActionBar.l {
    public final ye0 f26659t1;

    public re0(ye0 ye0Var, Activity activity) {
        super(activity, null);
        this.f26659t1 = ye0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f26659t1).containerView;
        viewGroup.invalidate();
    }
}
