package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class lj0 extends t00 {
    public final qj0 U;

    public lj0(qj0 qj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = qj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ta0 ta0Var;
        qj0 qj0Var = this.U;
        if (!qj0Var.H.isEmpty() && (ta0Var = qj0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + ta0Var.getMeasuredHeight();
        }
        return 0;
    }
}
