package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class ie0 extends org.telegram.ui.ActionBar.k {
    public final pe0 f27107t1;

    public ie0(pe0 pe0Var, Activity activity) {
        super(activity, null);
        this.f27107t1 = pe0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27107t1).containerView;
        viewGroup.invalidate();
    }
}
