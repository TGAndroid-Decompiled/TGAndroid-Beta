package org.telegram.ui.Components;

import android.content.Context;
public final class zh0 extends wz {
    public final ei0 V;

    public zh0(ei0 ei0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.V = ei0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        y90 y90Var;
        ei0 ei0Var = this.V;
        if (!ei0Var.I.isEmpty() && (y90Var = ei0Var.K) != null) {
            return org.telegram.messenger.g0.L(8.0f) + y90Var.getMeasuredHeight();
        }
        return 0;
    }
}
