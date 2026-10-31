package org.telegram.ui.Components;

import android.content.Context;
public final class qi0 extends zz {
    public final vi0 U;

    public qi0(vi0 vi0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.U = vi0Var;
    }

    @Override
    public final int getAdditionalHeight() {
        da0 da0Var;
        vi0 vi0Var = this.U;
        if (!vi0Var.H.isEmpty() && (da0Var = vi0Var.J) != null) {
            return org.telegram.messenger.i0.L(8.0f) + da0Var.getMeasuredHeight();
        }
        return 0;
    }
}
