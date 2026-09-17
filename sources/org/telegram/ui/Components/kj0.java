package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kj0 extends t00 {
    public final pj0 U;

    public kj0(pj0 pj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = pj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ua0 ua0Var;
        pj0 pj0Var = this.U;
        if (!pj0Var.H.isEmpty() && (ua0Var = pj0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + ua0Var.getMeasuredHeight();
        }
        return 0;
    }
}
