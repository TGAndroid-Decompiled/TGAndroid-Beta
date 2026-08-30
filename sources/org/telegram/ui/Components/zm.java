package org.telegram.ui.Components;

import android.content.Context;
public final class zm extends li {
    public final Runnable M2;

    public zm(Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        super(context, p2Var, false, false, true, f6Var);
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
