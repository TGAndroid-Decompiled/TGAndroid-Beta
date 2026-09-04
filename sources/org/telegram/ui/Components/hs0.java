package org.telegram.ui.Components;

import android.content.Context;
public final class hs0 extends xw0 {
    public final xu0 K;

    public hs0(xu0 xu0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = xu0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
