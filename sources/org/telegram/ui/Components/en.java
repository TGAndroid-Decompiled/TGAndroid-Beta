package org.telegram.ui.Components;

import android.content.Context;
public final class en extends wi {
    public final Runnable I2;

    public en(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.e6 e6Var, Runnable runnable) {
        super(context, o2Var, false, false, true, e6Var);
        this.I2 = runnable;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.I2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
