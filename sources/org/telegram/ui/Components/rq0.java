package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class rq0 extends FragmentContextView {
    public final zs0 X0;

    public rq0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.f2 f2Var, zs0 zs0Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, f2Var, zs0Var2, false, g6Var);
        this.X0 = zs0Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        zs0 zs0Var = this.X0;
        pr prVar = zs0Var.R0;
        FrameLayout frameLayout = zs0Var.S0;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        prVar.i(frameLayout, z9, true);
    }
}
