package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class uj0 extends u00 {
    public final zj0 R;

    public uj0(zj0 zj0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.R = zj0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        xa0 xa0Var;
        zj0 zj0Var = this.R;
        if (!zj0Var.E.isEmpty() && (xa0Var = zj0Var.G) != null) {
            return AndroidUtilities.dp(8.0f) + xa0Var.getMeasuredHeight();
        }
        return 0;
    }
}
