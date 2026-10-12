package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class tt0 extends FragmentContextView {
    public final hw0 R0;

    public tt0(hw0 hw0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, hw0 hw0Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m2Var, hw0Var2, false, c6Var);
        this.R0 = hw0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        hw0 hw0Var = this.R0;
        ct ctVar = hw0Var.P0;
        FrameLayout frameLayout = hw0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ctVar.i(frameLayout, z10, true);
    }
}
