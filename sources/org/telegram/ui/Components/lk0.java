package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class lk0 extends b10 {
    public final qk0 U;

    public lk0(qk0 qk0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U = qk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        pb0 pb0Var;
        qk0 qk0Var = this.U;
        if (!qk0Var.H.isEmpty() && (pb0Var = qk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + pb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
