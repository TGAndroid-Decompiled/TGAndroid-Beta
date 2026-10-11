package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ot0 extends FragmentContextView {
    public final cw0 R0;

    public ot0(cw0 cw0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, cw0 cw0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, cw0Var2, false, d6Var);
        this.R0 = cw0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        cw0 cw0Var = this.R0;
        bt btVar = cw0Var.P0;
        FrameLayout frameLayout = cw0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        btVar.i(frameLayout, z10, true);
    }
}
