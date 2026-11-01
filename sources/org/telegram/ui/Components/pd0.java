package org.telegram.ui.Components;

import android.app.Activity;
public final class pd0 extends org.telegram.ui.ActionBar.l {
    public final vd0 F1;

    public pd0(vd0 vd0Var, Activity activity) {
        super(activity, null);
        this.F1 = vd0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.F1.f21587b.invalidate();
    }
}
