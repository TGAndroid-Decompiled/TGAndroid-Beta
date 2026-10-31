package org.telegram.ui.Components;

import android.app.Activity;
public final class pd0 extends org.telegram.ui.ActionBar.l {
    public final vd0 E1;

    public pd0(vd0 vd0Var, Activity activity) {
        super(activity, null);
        this.E1 = vd0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.E1.f21586b.invalidate();
    }
}
