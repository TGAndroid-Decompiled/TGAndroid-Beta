package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class rk0 extends k10 {
    public final wk0 U;

    public rk0(wk0 wk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = wk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        wb0 wb0Var;
        wk0 wk0Var = this.U;
        if (!wk0Var.H.isEmpty() && (wb0Var = wk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + wb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
