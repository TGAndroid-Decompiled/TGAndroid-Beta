package org.telegram.ui.Components;

import android.content.Context;
public final class us0 extends jx0 {
    public final kv0 K;

    public us0(kv0 kv0Var, Context context, v00 v00Var) {
        super(context, v00Var, 1, null);
        this.K = kv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
