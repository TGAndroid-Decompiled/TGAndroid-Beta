package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class jt0 extends FragmentContextView {
    public final xv0 X0;

    public jt0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, xv0 xv0Var2, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, o2Var, xv0Var2, false, g6Var);
        this.X0 = xv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        xv0 xv0Var = this.X0;
        us usVar = xv0Var.P0;
        FrameLayout frameLayout = xv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        usVar.i(frameLayout, z10, true);
    }
}
