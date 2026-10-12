package org.telegram.ui.Components;

import android.content.Context;
public final class pn extends vi {
    public final Runnable S2;

    public pn(Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        super(context, m2Var, false, false, true, c6Var);
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
