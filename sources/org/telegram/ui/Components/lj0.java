package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class lj0 extends u00 {
    public final qj0 U;

    public lj0(qj0 qj0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = qj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ua0 ua0Var;
        qj0 qj0Var = this.U;
        if (!qj0Var.H.isEmpty() && (ua0Var = qj0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + ua0Var.getMeasuredHeight();
        }
        return 0;
    }
}
