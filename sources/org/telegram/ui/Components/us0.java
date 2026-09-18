package org.telegram.ui.Components;

import android.content.Context;
public final class us0 extends kx0 {
    public final kv0 K;

    public us0(kv0 kv0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = kv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
