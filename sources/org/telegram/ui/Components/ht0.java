package org.telegram.ui.Components;

import android.content.Context;
public final class ht0 extends wx0 {
    public final xv0 K;

    public ht0(xv0 xv0Var, Context context, f10 f10Var) {
        super(context, f10Var, 1, null);
        this.K = xv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.F0();
    }
}
