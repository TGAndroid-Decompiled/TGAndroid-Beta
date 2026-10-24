package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class kk0 extends z00 {
    public final pk0 U;

    public kk0(pk0 pk0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U = pk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        nb0 nb0Var;
        pk0 pk0Var = this.U;
        if (!pk0Var.H.isEmpty() && (nb0Var = pk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + nb0Var.getMeasuredHeight();
        }
        return 0;
    }
}
