package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ts0 extends FragmentContextView {
    public final iv0 N0;

    public ts0(iv0 iv0Var, Context context, org.telegram.ui.ActionBar.p2 p2Var, iv0 iv0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, p2Var, iv0Var2, false, f6Var);
        this.N0 = iv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        iv0 iv0Var = this.N0;
        qs qsVar = iv0Var.P0;
        FrameLayout frameLayout = iv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        qsVar.i(frameLayout, z10, true);
    }
}
