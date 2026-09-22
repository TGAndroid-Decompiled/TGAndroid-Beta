package org.telegram.ui.Components;

import android.content.Context;
public final class vs0 extends lx0 {
    public final lv0 K;

    public vs0(lv0 lv0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = lv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
