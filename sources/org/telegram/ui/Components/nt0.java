package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class nt0 extends FragmentContextView {
    public final bw0 R0;

    public nt0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, bw0 bw0Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, n2Var, bw0Var2, false, e6Var);
        this.R0 = bw0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        bw0 bw0Var = this.R0;
        at atVar = bw0Var.P0;
        FrameLayout frameLayout = bw0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        atVar.i(frameLayout, z10, true);
    }
}
