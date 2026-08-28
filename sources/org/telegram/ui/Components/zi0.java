package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
public final class zi0 extends e00 {
    public final ej0 Q;

    public zi0(ej0 ej0Var, Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, b6Var);
        this.Q = ej0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        ca0 ca0Var;
        ej0 ej0Var = this.Q;
        if (!ej0Var.D.isEmpty() && (ca0Var = ej0Var.F) != null) {
            return AndroidUtilities.dp(8.0f) + ca0Var.getMeasuredHeight();
        }
        return 0;
    }
}
