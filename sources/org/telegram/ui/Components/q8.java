package org.telegram.ui.Components;

import android.app.Activity;
public final class q8 extends w8 {
    public final p8 H;

    public q8(x8 x8Var, Activity activity, p8 p8Var) {
        super(x8Var, activity);
        this.H = p8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
