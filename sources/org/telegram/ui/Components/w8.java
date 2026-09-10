package org.telegram.ui.Components;

import android.app.Activity;
public final class w8 extends c9 {
    public final v8 G;

    public w8(d9 d9Var, Activity activity, v8 v8Var) {
        super(d9Var, activity);
        this.G = v8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
