package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class uj0 extends t00 {
    public final zj0 U;

    public uj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = zj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        bb0 bb0Var;
        zj0 zj0Var = this.U;
        if (!zj0Var.H.isEmpty() && (bb0Var = zj0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + bb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
