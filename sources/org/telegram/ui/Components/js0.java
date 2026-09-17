package org.telegram.ui.Components;

import android.content.Context;
public final class js0 extends zw0 {
    public final zu0 K;

    public js0(zu0 zu0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = zu0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
