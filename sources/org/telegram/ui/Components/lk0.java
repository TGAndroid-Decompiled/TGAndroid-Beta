package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class lk0 extends f10 {
    public final qk0 U;

    public lk0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.U = qk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ub0 ub0Var;
        qk0 qk0Var = this.U;
        if (!qk0Var.H.isEmpty() && (ub0Var = qk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + ub0Var.getMeasuredHeight();
        }
        return 0;
    }
}
