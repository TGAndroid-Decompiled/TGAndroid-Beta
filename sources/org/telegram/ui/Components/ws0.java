package org.telegram.ui.Components;

import android.content.Context;
public final class ws0 extends lx0 {
    public final mv0 K;

    public ws0(mv0 mv0Var, Context context, w00 w00Var) {
        super(context, w00Var, 1, null);
        this.K = mv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
