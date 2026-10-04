package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class bt0 extends FragmentContextView {
    public final pv0 Q0;

    public bt0(pv0 pv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, pv0 pv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, n2Var, pv0Var2, false, d6Var);
        this.Q0 = pv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        pv0 pv0Var = this.Q0;
        ns nsVar = pv0Var.P0;
        FrameLayout frameLayout = pv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        nsVar.i(frameLayout, z10, true);
    }
}
