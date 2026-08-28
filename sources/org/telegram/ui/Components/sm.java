package org.telegram.ui.Components;

import android.content.Context;
public final class sm extends ki {
    public final Runnable L2;

    public sm(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var, Runnable runnable) {
        super(context, o2Var, false, false, true, b6Var);
        this.L2 = runnable;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.L2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
