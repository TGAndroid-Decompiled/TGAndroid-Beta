package org.telegram.ui.Components;

import android.content.Context;
public final class pt0 extends fy0 {
    public final bw0 K;

    public pt0(bw0 bw0Var, Context context, c10 c10Var) {
        super(context, c10Var, 1, null);
        this.K = bw0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.L0();
    }
}
