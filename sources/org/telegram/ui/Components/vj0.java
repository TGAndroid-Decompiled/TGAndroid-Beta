package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class vj0 extends u00 {
    public final ak0 U;

    public vj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = ak0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        fb0 fb0Var;
        ak0 ak0Var = this.U;
        if (!ak0Var.H.isEmpty() && (fb0Var = ak0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + fb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
