package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class pr0 extends FragmentContextView {
    public final zt0 X0;

    public pr0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, zt0 zt0Var2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, zt0Var2, false, p6Var);
        this.X0 = zt0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        zt0 zt0Var = this.X0;
        zr zrVar = zt0Var.R0;
        FrameLayout frameLayout = zt0Var.S0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zrVar.i(frameLayout, z10, true);
    }
}
