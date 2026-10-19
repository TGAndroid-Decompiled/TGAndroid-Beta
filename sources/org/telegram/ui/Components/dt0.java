package org.telegram.ui.Components;

import android.content.Context;
public final class dt0 extends sx0 {
    public final tv0 K;

    public dt0(tv0 tv0Var, Context context, b10 b10Var) {
        super(context, b10Var, 1, null);
        this.K = tv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.G0();
    }
}
