package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class oq0 extends FragmentContextView {
    public final ws0 Y0;

    public oq0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.d2 d2Var, ws0 ws0Var2, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, d2Var, ws0Var2, false, e6Var);
        this.Y0 = ws0Var;
    }

    @Override
    public final void setVisibility(int i3) {
        boolean z10;
        ws0 ws0Var = this.Y0;
        pr prVar = ws0Var.S0;
        FrameLayout frameLayout = ws0Var.T0;
        if (i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        prVar.i(frameLayout, z10, true);
    }
}
