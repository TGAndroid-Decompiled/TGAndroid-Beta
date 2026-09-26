package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class te0 extends org.telegram.ui.ActionBar.k {
    public final af0 f28526t1;

    public te0(af0 af0Var, Activity activity) {
        super(activity, null);
        this.f28526t1 = af0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f28526t1).containerView;
        viewGroup.invalidate();
    }
}
