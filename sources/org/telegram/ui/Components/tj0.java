package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tj0 extends t00 {
    public final yj0 R;

    public tj0(yj0 yj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.R = yj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        va0 va0Var;
        yj0 yj0Var = this.R;
        if (!yj0Var.E.isEmpty() && (va0Var = yj0Var.G) != null) {
            return AndroidUtilities.dp(8.0f) + va0Var.getMeasuredHeight();
        }
        return 0;
    }
}
