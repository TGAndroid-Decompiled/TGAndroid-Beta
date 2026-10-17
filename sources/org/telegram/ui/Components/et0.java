package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class et0 extends FragmentContextView {
    public final sv0 R0;

    public et0(sv0 sv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, sv0 sv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, sv0Var2, false, d6Var);
        this.R0 = sv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        sv0 sv0Var = this.R0;
        us usVar = sv0Var.P0;
        FrameLayout frameLayout = sv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        usVar.i(frameLayout, z10, true);
    }
}
