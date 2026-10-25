package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kk0 extends c10 {
    public final pk0 U;

    public kk0(pk0 pk0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.U = pk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        mb0 mb0Var;
        pk0 pk0Var = this.U;
        if (!pk0Var.H.isEmpty() && (mb0Var = pk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + mb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
