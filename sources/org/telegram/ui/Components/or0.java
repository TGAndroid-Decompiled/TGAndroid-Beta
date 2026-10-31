package org.telegram.ui.Components;

import android.content.Context;
public final class or0 extends dw0 {
    public final zt0 K;

    public or0(zt0 zt0Var, Context context, zz zzVar) {
        super(context, zzVar, 1, null);
        this.K = zt0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.M0();
    }
}
