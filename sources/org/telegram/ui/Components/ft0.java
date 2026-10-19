package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ft0 extends FragmentContextView {
    public final tv0 R0;

    public ft0(tv0 tv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, tv0 tv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, tv0Var2, false, d6Var);
        this.R0 = tv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        tv0 tv0Var = this.R0;
        us usVar = tv0Var.P0;
        FrameLayout frameLayout = tv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        usVar.i(frameLayout, z10, true);
    }
}
