package org.telegram.ui.Components;

import android.content.Context;
public final class pq0 extends cv0 {
    public final ys0 L;

    public pq0(ys0 ys0Var, Context context, pz pzVar) {
        super(context, pzVar, 1, null);
        this.L = ys0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.L.Q0();
    }
}
