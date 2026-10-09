package org.telegram.ui.Components;

import android.content.Context;
public final class sn extends yi {
    public final Runnable S2;

    public sn(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, e6Var);
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
