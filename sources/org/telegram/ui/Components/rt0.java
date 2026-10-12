package org.telegram.ui.Components;

import android.content.Context;
public final class rt0 extends gy0 {
    public final hw0 K;

    public rt0(hw0 hw0Var, Context context, m10 m10Var) {
        super(context, m10Var, 1, null);
        this.K = hw0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
