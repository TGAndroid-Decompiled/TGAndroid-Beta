package org.telegram.ui.Components;

import android.content.Context;
public final class ur0 extends ScrollSlidingTextTabStrip {
    public final zt0 f31020p0;

    public ur0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f31020p0 = zt0Var;
    }

    @Override
    public final int e(int i10) {
        return this.f31020p0.c1(i10);
    }
}
