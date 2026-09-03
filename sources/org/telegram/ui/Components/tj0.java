package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class tj0 extends u00 {
    public final yj0 R;

    public tj0(yj0 yj0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.R = yj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        wa0 wa0Var;
        yj0 yj0Var = this.R;
        if (!yj0Var.E.isEmpty() && (wa0Var = yj0Var.G) != null) {
            return AndroidUtilities.dp(8.0f) + wa0Var.getMeasuredHeight();
        }
        return 0;
    }
}
