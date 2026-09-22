package org.telegram.ui.Components;

import android.content.Context;
public final class is0 extends yw0 {
    public final yu0 K;

    public is0(yu0 yu0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = yu0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
