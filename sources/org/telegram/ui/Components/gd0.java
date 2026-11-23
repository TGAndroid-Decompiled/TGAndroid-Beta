package org.telegram.ui.Components;

import android.app.Activity;
public final class gd0 extends org.telegram.ui.ActionBar.k {
    public final md0 G1;

    public gd0(md0 md0Var, Activity activity) {
        super(activity, null);
        this.G1 = md0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.f30142b.invalidate();
    }
}
