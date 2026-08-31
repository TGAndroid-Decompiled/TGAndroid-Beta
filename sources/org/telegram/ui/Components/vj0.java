package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class vj0 extends u00 {
    public final ak0 R;

    public vj0(ak0 ak0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.R = ak0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        xa0 xa0Var;
        ak0 ak0Var = this.R;
        if (!ak0Var.E.isEmpty() && (xa0Var = ak0Var.G) != null) {
            return AndroidUtilities.dp(8.0f) + xa0Var.getMeasuredHeight();
        }
        return 0;
    }
}
