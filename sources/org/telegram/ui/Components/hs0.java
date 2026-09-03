package org.telegram.ui.Components;

import android.content.Context;
public final class hs0 extends zw0 {
    public final yu0 H;

    public hs0(yu0 yu0Var, Context context, u00 u00Var) {
        super(context, u00Var, 1, null);
        this.H = yu0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.H.E0();
    }
}
