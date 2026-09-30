package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class yj0 extends w00 {
    public final dk0 U;

    public yj0(dk0 dk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = dk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ib0 ib0Var;
        dk0 dk0Var = this.U;
        if (!dk0Var.H.isEmpty() && (ib0Var = dk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + ib0Var.getMeasuredHeight();
        }
        return 0;
    }
}
