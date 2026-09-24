package org.telegram.ui.Components;

import android.content.Context;
public final class ts0 extends ix0 {
    public final jv0 K;

    public ts0(jv0 jv0Var, Context context, u00 u00Var) {
        super(context, u00Var, 1, null);
        this.K = jv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
