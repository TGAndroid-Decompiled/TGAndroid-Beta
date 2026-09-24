package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class vs0 extends FragmentContextView {
    public final jv0 P0;

    public vs0(jv0 jv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, jv0 jv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, jv0Var2, false, d6Var);
        this.P0 = jv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        jv0 jv0Var = this.P0;
        ls lsVar = jv0Var.P0;
        FrameLayout frameLayout = jv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        lsVar.i(frameLayout, z10, true);
    }
}
