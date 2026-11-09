package org.telegram.ui.Components;

import android.content.Context;
public final class pq0 extends cv0 {
    public final zs0 K;

    public pq0(zs0 zs0Var, Context context, mz mzVar) {
        super(context, mzVar, 1, null);
        this.K = zs0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.Q0();
    }
}
