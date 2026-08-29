package org.telegram.ui.Components;

import android.app.Activity;
public final class u8 extends a9 {
    public final t8 C;

    public u8(b9 b9Var, Activity activity, t8 t8Var) {
        super(b9Var, activity);
        this.C = t8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.C.invalidate();
    }
}
