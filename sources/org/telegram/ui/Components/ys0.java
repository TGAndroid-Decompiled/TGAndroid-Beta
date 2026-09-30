package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ys0 extends FragmentContextView {
    public final mv0 Q0;

    public ys0(mv0 mv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, mv0 mv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, mv0Var2, false, d6Var);
        this.Q0 = mv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        mv0 mv0Var = this.Q0;
        ns nsVar = mv0Var.P0;
        FrameLayout frameLayout = mv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        nsVar.i(frameLayout, z10, true);
    }
}
