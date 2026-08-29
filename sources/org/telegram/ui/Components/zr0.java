package org.telegram.ui.Components;

import android.content.Context;
public final class zr0 extends qw0 {
    public final qu0 G;

    public zr0(qu0 qu0Var, Context context, p00 p00Var) {
        super(context, p00Var, 1, null);
        this.G = qu0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.G.E0();
    }
}
