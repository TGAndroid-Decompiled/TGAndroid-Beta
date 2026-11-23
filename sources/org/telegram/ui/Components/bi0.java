package org.telegram.ui.Components;

import android.content.Context;
public final class bi0 extends vz {
    public final gi0 V;

    public bi0(gi0 gi0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.V = gi0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        x90 x90Var;
        gi0 gi0Var = this.V;
        if (!gi0Var.I.isEmpty() && (x90Var = gi0Var.K) != null) {
            return org.telegram.messenger.g0.L(8.0f) + x90Var.getMeasuredHeight();
        }
        return 0;
    }
}
