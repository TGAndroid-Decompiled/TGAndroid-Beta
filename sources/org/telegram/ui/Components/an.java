package org.telegram.ui.Components;

import android.content.Context;
public final class an extends mi {
    public final Runnable M2;

    public an(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        super(context, p2Var, false, false, true, g6Var);
        this.M2 = runnable;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.M2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
