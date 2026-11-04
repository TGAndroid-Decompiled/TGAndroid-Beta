package org.telegram.ui.Components;

import android.content.Context;
public final class ph0 extends iz {
    public final uh0 V;

    public ph0(uh0 uh0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.V = uh0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        h90 h90Var;
        uh0 uh0Var = this.V;
        if (!uh0Var.I.isEmpty() && (h90Var = uh0Var.K) != null) {
            return org.telegram.messenger.g0.L(8.0f) + h90Var.getMeasuredHeight();
        }
        return 0;
    }
}
