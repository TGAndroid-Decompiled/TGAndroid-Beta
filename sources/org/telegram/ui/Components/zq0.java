package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class zq0 extends FragmentContextView {
    public final gt0 Y0;

    public zq0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.h2 h2Var, gt0 gt0Var2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, h2Var, gt0Var2, false, i6Var);
        this.Y0 = gt0Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        gt0 gt0Var = this.Y0;
        cs csVar = gt0Var.S0;
        FrameLayout frameLayout = gt0Var.T0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        csVar.j(frameLayout, z10, true);
    }
}
