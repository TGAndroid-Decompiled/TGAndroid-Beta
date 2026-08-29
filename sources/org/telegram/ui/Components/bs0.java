package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class bs0 extends FragmentContextView {
    public final qu0 J0;

    public bs0(qu0 qu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, qu0 qu0Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, o2Var, qu0Var2, false, c6Var);
        this.J0 = qu0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        qu0 qu0Var = this.J0;
        fs fsVar = qu0Var.L0;
        FrameLayout frameLayout = qu0Var.M0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        fsVar.i(frameLayout, z10, true);
    }
}
