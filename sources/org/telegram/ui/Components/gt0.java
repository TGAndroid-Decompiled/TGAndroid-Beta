package org.telegram.ui.Components;

import android.content.Context;
public final class gt0 extends vx0 {
    public final wv0 K;

    public gt0(wv0 wv0Var, Context context, z00 z00Var) {
        super(context, z00Var, 1, null);
        this.K = wv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.H0();
    }
}
