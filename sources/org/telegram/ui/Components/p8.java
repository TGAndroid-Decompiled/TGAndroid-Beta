package org.telegram.ui.Components;

import android.app.Activity;
public final class p8 extends v8 {
    public final o8 C;

    public p8(w8 w8Var, Activity activity, o8 o8Var) {
        super(w8Var, activity);
        this.C = o8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.C.invalidate();
    }
}
