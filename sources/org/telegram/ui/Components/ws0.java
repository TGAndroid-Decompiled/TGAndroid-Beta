package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ws0 extends FragmentContextView {
    public final kv0 P0;

    public ws0(kv0 kv0Var, Context context, org.telegram.ui.ActionBar.m2 m2Var, kv0 kv0Var2, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, m2Var, kv0Var2, false, d6Var);
        this.P0 = kv0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        kv0 kv0Var = this.P0;
        ms msVar = kv0Var.P0;
        FrameLayout frameLayout = kv0Var.Q0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        msVar.i(frameLayout, z10, true);
    }
}
