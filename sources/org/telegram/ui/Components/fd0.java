package org.telegram.ui.Components;

import android.app.Activity;
public final class fd0 extends org.telegram.ui.ActionBar.k {
    public final ld0 G1;

    public fd0(ld0 ld0Var, Activity activity) {
        super(activity, null);
        this.G1 = ld0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.f30190b.invalidate();
    }
}
