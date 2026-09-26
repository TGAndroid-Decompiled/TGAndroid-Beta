package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class wj0 extends v00 {
    public final bk0 U;

    public wj0(bk0 bk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = bk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        gb0 gb0Var;
        bk0 bk0Var = this.U;
        if (!bk0Var.H.isEmpty() && (gb0Var = bk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + gb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
