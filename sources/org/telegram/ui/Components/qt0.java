package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class qt0 extends FragmentContextView {
    public final bw0 X0;

    public qt0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, bw0 bw0Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, r2Var, bw0Var2, false, u6Var);
        this.X0 = bw0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        bw0 bw0Var = this.X0;
        ws wsVar = bw0Var.R0;
        FrameLayout frameLayout = bw0Var.S0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wsVar.i(frameLayout, z10, true);
    }
}
