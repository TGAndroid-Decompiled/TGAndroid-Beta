package org.telegram.ui.Components;

import android.content.Context;
public final class mh0 extends lz {
    public final rh0 U;

    public mh0(rh0 rh0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.U = rh0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        l90 l90Var;
        rh0 rh0Var = this.U;
        if (!rh0Var.H.isEmpty() && (l90Var = rh0Var.J) != null) {
            return org.telegram.messenger.g0.L(8.0f) + l90Var.getMeasuredHeight();
        }
        return 0;
    }
}
