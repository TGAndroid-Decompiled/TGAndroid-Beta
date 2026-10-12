package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class jt0 extends FragmentContextView {
    public final xv0 R0;

    public jt0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, xv0 xv0Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, m2Var, xv0Var2, false, c6Var);
        this.R0 = xv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        xv0 xv0Var = this.R0;
        xs xsVar = xv0Var.P0;
        FrameLayout frameLayout = xv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        xsVar.i(frameLayout, z10, true);
    }
}
