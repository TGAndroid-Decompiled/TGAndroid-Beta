package org.telegram.ui.Components;

import android.content.Context;
public final class qh0 extends pz {
    public final vh0 V;

    public qh0(vh0 vh0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V = vh0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        n90 n90Var;
        vh0 vh0Var = this.V;
        if (!vh0Var.I.isEmpty() && (n90Var = vh0Var.K) != null) {
            return org.telegram.messenger.g0.L(8.0f) + n90Var.getMeasuredHeight();
        }
        return 0;
    }
}
