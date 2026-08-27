package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;

public final class bj0 extends h00 {
    public final gj0 Q;

    public bj0(gj0 gj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.Q = gj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ga0 ga0Var;
        gj0 gj0Var = this.Q;
        if (gj0Var.D.isEmpty() || (ga0Var = gj0Var.F) == null) {
            return 0;
        }
        return AndroidUtilities.dp(8.0f) + ga0Var.getMeasuredHeight();
    }
}
