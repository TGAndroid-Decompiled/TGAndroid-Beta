package org.telegram.ui.Components;

import android.content.Context;
public final class nq0 extends zu0 {
    public final ws0 L;

    public nq0(ws0 ws0Var, Context context, iz izVar) {
        super(context, izVar, 1, null);
        this.L = ws0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.L.P0();
    }
}
