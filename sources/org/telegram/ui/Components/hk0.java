package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class hk0 extends b10 {
    public final mk0 U;

    public hk0(mk0 mk0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.U = mk0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ob0 ob0Var;
        mk0 mk0Var = this.U;
        if (!mk0Var.H.isEmpty() && (ob0Var = mk0Var.J) != null) {
            return AndroidUtilities.dp(8.0f) + ob0Var.getMeasuredHeight();
        }
        return 0;
    }
}
