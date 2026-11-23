package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ar0 extends FragmentContextView {
    public final it0 Y0;

    public ar0(it0 it0Var, Context context, org.telegram.ui.ActionBar.g2 g2Var, it0 it0Var2, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, g2Var, it0Var2, false, i6Var);
        this.Y0 = it0Var;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        it0 it0Var = this.Y0;
        bs bsVar = it0Var.S0;
        FrameLayout frameLayout = it0Var.T0;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bsVar.j(frameLayout, z10, true);
    }
}
