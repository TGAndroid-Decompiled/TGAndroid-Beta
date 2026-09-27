package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class xj0 extends v00 {
    public final ck0 U;

    public xj0(ck0 ck0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.U = ck0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        gb0 gb0Var;
        ck0 ck0Var = this.U;
        if (!ck0Var.H.isEmpty() && (gb0Var = ck0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + gb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
