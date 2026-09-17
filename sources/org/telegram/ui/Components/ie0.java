package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class ie0 extends org.telegram.ui.ActionBar.k {
    public final pe0 f24932u1;

    public ie0(pe0 pe0Var, Activity activity) {
        super(activity, null);
        this.f24932u1 = pe0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f24932u1).containerView;
        viewGroup.invalidate();
    }
}
