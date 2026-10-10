package org.telegram.ui.Components;

import android.content.Context;
public final class mt0 extends by0 {
    public final cw0 K;

    public mt0(cw0 cw0Var, Context context, k10 k10Var) {
        super(context, k10Var, 1, null);
        this.K = cw0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
