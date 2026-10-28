package org.telegram.ui.Components;

import android.content.Context;
public final class vt0 extends ScrollSlidingTextTabStrip {
    public final bw0 f34367p0;

    public vt0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f34367p0 = bw0Var;
    }

    @Override
    public final int e(int i10) {
        return this.f34367p0.b1(i10);
    }
}
