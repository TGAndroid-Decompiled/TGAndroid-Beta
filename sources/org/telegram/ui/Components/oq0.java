package org.telegram.ui.Components;

import android.content.Context;
public final class oq0 extends bv0 {
    public final ys0 K;

    public oq0(ys0 ys0Var, Context context, lz lzVar) {
        super(context, lzVar, 1, null);
        this.K = ys0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.Q0();
    }
}
