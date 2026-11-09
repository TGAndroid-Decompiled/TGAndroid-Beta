package org.telegram.ui.Components;

import android.content.Context;
public final class nh0 extends mz {
    public final sh0 U;

    public nh0(sh0 sh0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U = sh0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        m90 m90Var;
        sh0 sh0Var = this.U;
        if (!sh0Var.H.isEmpty() && (m90Var = sh0Var.J) != null) {
            return org.telegram.messenger.g0.L(8.0f) + m90Var.getMeasuredHeight();
        }
        return 0;
    }
}
