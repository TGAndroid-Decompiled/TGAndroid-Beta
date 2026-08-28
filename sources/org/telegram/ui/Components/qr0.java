package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class qr0 extends FragmentContextView {
    public final eu0 J0;

    public qr0(eu0 eu0Var, Context context, org.telegram.ui.ActionBar.o2 o2Var, eu0 eu0Var2, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, o2Var, eu0Var2, false, b6Var);
        this.J0 = eu0Var;
    }

    @Override
    public final void setVisibility(int i9) {
        boolean z10;
        eu0 eu0Var = this.J0;
        bs bsVar = eu0Var.L0;
        FrameLayout frameLayout = eu0Var.M0;
        if (i9 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bsVar.i(frameLayout, z10, true);
    }
}
