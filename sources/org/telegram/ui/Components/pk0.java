package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class pk0 extends j10 {
    public final uk0 U;

    public pk0(uk0 uk0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.U = uk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        vb0 vb0Var;
        uk0 uk0Var = this.U;
        if (!uk0Var.H.isEmpty() && (vb0Var = uk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + vb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
