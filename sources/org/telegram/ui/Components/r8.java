package org.telegram.ui.Components;

import android.app.Activity;
public final class r8 extends x8 {
    public final q8 H;

    public r8(y8 y8Var, Activity activity, q8 q8Var) {
        super(y8Var, activity);
        this.H = q8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
