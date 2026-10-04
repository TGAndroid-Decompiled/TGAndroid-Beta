package org.telegram.ui.Components;

import android.content.Context;
public final class zs0 extends tx0 {
    public final pv0 K;

    public zs0(pv0 pv0Var, Context context, w00 w00Var) {
        super(context, w00Var, 1, null);
        this.K = pv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
