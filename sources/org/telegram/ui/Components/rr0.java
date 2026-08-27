package org.telegram.ui.Components;

import android.content.Context;

public final class rr0 extends FragmentContextView {
    public final hu0 J0;

    public rr0(hu0 hu0Var, Context context, org.telegram.ui.ActionBar.n2 n2Var, hu0 hu0Var2, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, n2Var, hu0Var2, false, c6Var);
        this.J0 = hu0Var;
    }

    @Override
    public final void setVisibility(int i10) {
        hu0 hu0Var = this.J0;
        hu0Var.L0.i(hu0Var.M0, i10 == 0, true);
    }
}
