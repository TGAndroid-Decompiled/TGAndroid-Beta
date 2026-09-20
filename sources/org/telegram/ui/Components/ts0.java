package org.telegram.ui.Components;

import android.content.Context;
public final class ts0 extends jx0 {
    public final jv0 K;

    public ts0(jv0 jv0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = jv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
