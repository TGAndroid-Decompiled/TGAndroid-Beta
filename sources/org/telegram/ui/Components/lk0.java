package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class lk0 extends c10 {
    public final qk0 U;

    public lk0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.U = qk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        nb0 nb0Var;
        qk0 qk0Var = this.U;
        if (!qk0Var.H.isEmpty() && (nb0Var = qk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + nb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
