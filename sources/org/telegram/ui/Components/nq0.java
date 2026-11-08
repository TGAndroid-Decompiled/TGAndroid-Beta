package org.telegram.ui.Components;

import android.content.Context;
public final class nq0 extends av0 {
    public final xs0 K;

    public nq0(xs0 xs0Var, Context context, mz mzVar) {
        super(context, mzVar, 1, null);
        this.K = xs0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.P0();
    }
}
