package org.telegram.ui.Components;

import android.content.Context;
public final class bn extends vi {
    public final Runnable P2;

    public bn(Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var, Runnable runnable) {
        super(context, n2Var, false, false, true, f6Var);
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
