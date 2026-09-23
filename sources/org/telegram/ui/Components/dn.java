package org.telegram.ui.Components;

import android.content.Context;
public final class dn extends wi {
    public final Runnable P2;

    public dn(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, d6Var);
        this.P2 = runnable;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.P2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
