package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class pt0 extends FragmentContextView {
    public final dw0 R0;

    public pt0(dw0 dw0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, dw0 dw0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, dw0Var2, false, d6Var);
        this.R0 = dw0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        dw0 dw0Var = this.R0;
        bt btVar = dw0Var.P0;
        FrameLayout frameLayout = dw0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        btVar.i(frameLayout, z10, true);
    }
}
