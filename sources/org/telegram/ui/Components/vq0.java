package org.telegram.ui.Components;

import android.content.Context;
public final class vq0 extends ScrollSlidingTextTabStrip {
    public final ys0 f41129q0;

    public vq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.f41129q0 = ys0Var;
    }

    @Override
    public final int e(int i7) {
        return this.f41129q0.h1(i7);
    }
}
