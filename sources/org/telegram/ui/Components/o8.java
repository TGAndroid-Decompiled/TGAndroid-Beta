package org.telegram.ui.Components;

import android.app.Activity;

public final class o8 extends u8 {
    public final n8 C;

    public o8(v8 v8Var, Activity activity, n8 n8Var) {
        super(v8Var, activity);
        this.C = n8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.C.invalidate();
    }
}
