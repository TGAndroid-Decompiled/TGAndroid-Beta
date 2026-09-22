package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class xj0 extends t00 {
    public final ck0 U;

    public xj0(ck0 ck0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.U = ck0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        eb0 eb0Var;
        ck0 ck0Var = this.U;
        if (!ck0Var.H.isEmpty() && (eb0Var = ck0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + eb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
