package org.telegram.ui.Components;

import android.content.Context;
public final class xm extends ni {
    public final Runnable L2;

    public xm(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        super(context, o2Var, false, false, true, c6Var);
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
