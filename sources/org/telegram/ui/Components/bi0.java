package org.telegram.ui.Components;

import android.content.Context;
public final class bi0 extends yz {
    public final gi0 V;

    public bi0(gi0 gi0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.V = gi0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        aa0 aa0Var;
        gi0 gi0Var = this.V;
        if (!gi0Var.I.isEmpty() && (aa0Var = gi0Var.K) != null) {
            return org.telegram.messenger.g0.L(8.0f) + aa0Var.getMeasuredHeight();
        }
        return 0;
    }
}
