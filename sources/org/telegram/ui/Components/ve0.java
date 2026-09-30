package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class ve0 extends org.telegram.ui.ActionBar.k {
    public final cf0 f29108t1;

    public ve0(cf0 cf0Var, Activity activity) {
        super(activity, null);
        this.f29108t1 = cf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f29108t1).containerView;
        viewGroup.invalidate();
    }
}
