package org.telegram.ui.Components;

import android.app.Activity;
public final class j8 extends p8 {
    public final i8 H;

    public j8(q8 q8Var, Activity activity, i8 i8Var) {
        super(q8Var, activity);
        this.H = i8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
