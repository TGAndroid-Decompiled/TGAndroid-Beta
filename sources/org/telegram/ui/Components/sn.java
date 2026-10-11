package org.telegram.ui.Components;

import android.content.Context;
public final class sn extends yi {
    public final Runnable S2;

    public sn(Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable) {
        super(context, m2Var, false, false, true, d6Var);
        this.S2 = runnable;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.S2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
