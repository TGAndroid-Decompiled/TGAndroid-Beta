package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kj0 extends t00 {
    public final pj0 U;

    public kj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.U = pj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ta0 ta0Var;
        pj0 pj0Var = this.U;
        if (!pj0Var.H.isEmpty() && (ta0Var = pj0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + ta0Var.getMeasuredHeight();
        }
        return 0;
    }
}
