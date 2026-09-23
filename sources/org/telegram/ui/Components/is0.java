package org.telegram.ui.Components;

import android.content.Context;
public final class is0 extends xw0 {
    public final yu0 K;

    public is0(yu0 yu0Var, Context context, u00 u00Var) {
        super(context, u00Var, 1, null);
        this.K = yu0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
