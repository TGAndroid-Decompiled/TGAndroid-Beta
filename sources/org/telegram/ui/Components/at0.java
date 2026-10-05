package org.telegram.ui.Components;

import android.content.Context;
public final class at0 extends ux0 {
    public final qv0 K;

    public at0(qv0 qv0Var, Context context, w00 w00Var) {
        super(context, w00Var, 1, null);
        this.K = qv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
