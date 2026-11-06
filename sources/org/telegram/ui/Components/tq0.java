package org.telegram.ui.Components;

import android.content.Context;
public final class tq0 extends ScrollSlidingTextTabStrip {
    public final xs0 f38395p0;

    public tq0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.f38395p0 = xs0Var;
    }

    @Override
    public final int e(int i7) {
        return this.f38395p0.f1(i7);
    }
}
