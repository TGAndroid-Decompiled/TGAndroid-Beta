package org.telegram.ui.Components;

import android.app.Activity;
public final class p8 extends v8 {
    public final o8 D;

    public p8(w8 w8Var, Activity activity, o8 o8Var) {
        super(w8Var, activity);
        this.D = o8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.D.invalidate();
    }
}
