package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class gt0 extends FragmentContextView {
    public final uv0 R0;

    public gt0(uv0 uv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, uv0 uv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, uv0Var2, false, d6Var);
        this.R0 = uv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        uv0 uv0Var = this.R0;
        us usVar = uv0Var.P0;
        FrameLayout frameLayout = uv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        usVar.i(frameLayout, z10, true);
    }
}
