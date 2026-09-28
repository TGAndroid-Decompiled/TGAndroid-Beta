package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class xj0 extends v00 {
    public final ck0 U;

    public xj0(ck0 ck0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = ck0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        hb0 hb0Var;
        ck0 ck0Var = this.U;
        if (!ck0Var.H.isEmpty() && (hb0Var = ck0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + hb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
