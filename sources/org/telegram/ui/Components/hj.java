package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class hj extends FragmentContextView {
    public final FrameLayout R0;
    public final mj S0;

    public hj(mj mjVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout2) {
        super(context, m2Var, frameLayout, false, c6Var);
        this.S0 = mjVar;
        this.R0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        ct ctVar = this.S0.f28586x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ctVar.i(this.R0, z10, true);
    }
}
