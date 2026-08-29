package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kj0 extends p00 {
    public final pj0 Q;

    public kj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var);
        this.Q = pj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        qa0 qa0Var;
        pj0 pj0Var = this.Q;
        if (!pj0Var.D.isEmpty() && (qa0Var = pj0Var.F) != null) {
            return AndroidUtilities.dp(8.0f) + qa0Var.getMeasuredHeight();
        }
        return 0;
    }
}
