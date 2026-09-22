package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class xs0 extends FragmentContextView {
    public final lv0 P0;

    public xs0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, lv0 lv0Var2, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, n2Var, lv0Var2, false, f6Var);
        this.P0 = lv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        lv0 lv0Var = this.P0;
        ks ksVar = lv0Var.P0;
        FrameLayout frameLayout = lv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ksVar.i(frameLayout, z10, true);
    }
}
