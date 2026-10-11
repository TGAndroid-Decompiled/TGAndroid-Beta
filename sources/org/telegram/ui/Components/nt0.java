package org.telegram.ui.Components;

import android.content.Context;
public final class nt0 extends cy0 {
    public final dw0 K;

    public nt0(dw0 dw0Var, Context context, k10 k10Var) {
        super(context, k10Var, 1, null);
        this.K = dw0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
