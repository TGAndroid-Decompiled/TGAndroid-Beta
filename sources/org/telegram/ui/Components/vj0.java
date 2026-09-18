package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class vj0 extends t00 {
    public final ak0 U;

    public vj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.U = ak0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        cb0 cb0Var;
        ak0 ak0Var = this.U;
        if (!ak0Var.H.isEmpty() && (cb0Var = ak0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + cb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
