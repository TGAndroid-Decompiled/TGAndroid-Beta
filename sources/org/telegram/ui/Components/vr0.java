package org.telegram.ui.Components;

import android.content.Context;
public final class vr0 extends ScrollSlidingTextTabStrip {
    public final au0 f31895p0;

    public vr0(au0 au0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.f31895p0 = au0Var;
    }

    @Override
    public final int e(int i10) {
        return this.f31895p0.d1(i10);
    }
}
