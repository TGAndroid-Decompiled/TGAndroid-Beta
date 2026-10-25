package org.telegram.ui.Components;

import android.content.Context;
public final class ut0 extends ScrollSlidingTextTabStrip {
    public final aw0 f33491p0;

    public ut0(aw0 aw0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.f33491p0 = aw0Var;
    }

    @Override
    public final int e(int i10) {
        return this.f33491p0.b1(i10);
    }
}
