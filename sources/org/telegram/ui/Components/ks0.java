package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ks0 extends FragmentContextView {
    public final yu0 P0;

    public ks0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, yu0 yu0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, yu0Var2, false, d6Var);
        this.P0 = yu0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        yu0 yu0Var = this.P0;
        ls lsVar = yu0Var.P0;
        FrameLayout frameLayout = yu0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        lsVar.i(frameLayout, z10, true);
    }
}
