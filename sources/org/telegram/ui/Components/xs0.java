package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class xs0 extends FragmentContextView {
    public final lv0 Q0;

    public xs0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, lv0 lv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, lv0Var2, false, d6Var);
        this.Q0 = lv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        lv0 lv0Var = this.Q0;
        ms msVar = lv0Var.P0;
        FrameLayout frameLayout = lv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        msVar.i(frameLayout, z10, true);
    }
}
