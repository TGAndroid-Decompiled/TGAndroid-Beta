package org.telegram.ui.Components;

import android.content.Context;
public final class vs0 extends kx0 {
    public final lv0 K;

    public vs0(lv0 lv0Var, Context context, v00 v00Var) {
        super(context, v00Var, 1, null);
        this.K = lv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
