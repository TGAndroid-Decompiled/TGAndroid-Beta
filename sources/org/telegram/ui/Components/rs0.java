package org.telegram.ui.Components;

import android.content.Context;
public final class rs0 extends jx0 {
    public final iv0 K;

    public rs0(iv0 iv0Var, Context context, a10 a10Var) {
        super(context, a10Var, 1, null);
        this.K = iv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
