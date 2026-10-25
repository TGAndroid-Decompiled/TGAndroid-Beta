package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class pt0 extends FragmentContextView {
    public final aw0 X0;

    public pt0(aw0 aw0Var, Context context, org.telegram.ui.ActionBar.r2 r2Var, aw0 aw0Var2, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, r2Var, aw0Var2, false, u6Var);
        this.X0 = aw0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        aw0 aw0Var = this.X0;
        ws wsVar = aw0Var.R0;
        FrameLayout frameLayout = aw0Var.S0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        wsVar.i(frameLayout, z10, true);
    }
}
