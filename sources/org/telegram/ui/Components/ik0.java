package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class ik0 extends b10 {
    public final nk0 U;

    public ik0(nk0 nk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = nk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ob0 ob0Var;
        nk0 nk0Var = this.U;
        if (!nk0Var.H.isEmpty() && (ob0Var = nk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + ob0Var.getMeasuredHeight();
        }
        return 0;
    }
}
