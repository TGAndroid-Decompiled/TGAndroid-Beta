package org.telegram.ui.Components;

import android.content.Context;
public final class nn extends ti {
    public final Runnable O2;

    public nn(Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var, Runnable runnable) {
        super(context, r2Var, false, false, true, u6Var);
        this.O2 = runnable;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.O2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
