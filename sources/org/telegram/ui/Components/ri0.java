package org.telegram.ui.Components;

import android.content.Context;
public final class ri0 extends zz {
    public final wi0 U;

    public ri0(wi0 wi0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.U = wi0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        da0 da0Var;
        wi0 wi0Var = this.U;
        if (!wi0Var.H.isEmpty() && (da0Var = wi0Var.J) != null) {
            return org.telegram.messenger.i0.L(8.0f) + da0Var.getMeasuredHeight();
        }
        return 0;
    }
}
