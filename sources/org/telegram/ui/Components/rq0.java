package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class rq0 extends FragmentContextView {
    public final ys0 Y0;

    public rq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e2 e2Var, ys0 ys0Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e2Var, ys0Var2, false, e6Var);
        this.Y0 = ys0Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        ys0 ys0Var = this.Y0;
        vr vrVar = ys0Var.S0;
        FrameLayout frameLayout = ys0Var.T0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vrVar.i(frameLayout, z10, true);
    }
}
