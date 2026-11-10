package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class qq0 extends FragmentContextView {
    public final ys0 X0;

    public qq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, ys0 ys0Var2, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, f2Var, ys0Var2, false, h6Var);
        this.X0 = ys0Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        ys0 ys0Var = this.X0;
        or orVar = ys0Var.R0;
        FrameLayout frameLayout = ys0Var.S0;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        orVar.i(frameLayout, z9, true);
    }
}
