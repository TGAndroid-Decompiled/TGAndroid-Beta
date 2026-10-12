package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class cj extends FragmentContextView {
    public final FrameLayout R0;
    public final hj S0;

    public cj(hj hjVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var, FrameLayout frameLayout2) {
        super(context, m2Var, frameLayout, false, c6Var);
        this.S0 = hjVar;
        this.R0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        xs xsVar = this.S0.f25688x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xsVar.i(this.R0, z10, true);
    }
}
