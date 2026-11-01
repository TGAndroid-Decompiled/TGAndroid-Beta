package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class qr0 extends FragmentContextView {
    public final au0 X0;

    public qr0(au0 au0Var, Context context, org.telegram.ui.ActionBar.k2 k2Var, au0 au0Var2, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, k2Var, au0Var2, false, p6Var);
        this.X0 = au0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        au0 au0Var = this.X0;
        zr zrVar = au0Var.R0;
        FrameLayout frameLayout = au0Var.S0;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zrVar.i(frameLayout, z10, true);
    }
}
