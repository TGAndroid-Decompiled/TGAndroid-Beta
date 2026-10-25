package org.telegram.ui.Components;

import android.content.Context;
public final class ot0 extends ey0 {
    public final aw0 K;

    public ot0(aw0 aw0Var, Context context, c10 c10Var) {
        super(context, c10Var, 1, null);
        this.K = aw0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.L0();
    }
}
