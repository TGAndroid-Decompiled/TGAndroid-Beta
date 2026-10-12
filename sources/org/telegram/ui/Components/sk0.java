package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class sk0 extends m10 {
    public final xk0 U;

    public sk0(xk0 xk0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.U = xk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        zb0 zb0Var;
        xk0 xk0Var = this.U;
        if (!xk0Var.H.isEmpty() && (zb0Var = xk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + zb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
