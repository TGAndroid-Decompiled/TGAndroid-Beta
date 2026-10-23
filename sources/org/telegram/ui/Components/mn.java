package org.telegram.ui.Components;

import android.content.Context;
public final class mn extends ti {
    public final Runnable V2;

    public mn(Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var, Runnable runnable) {
        super(context, o2Var, false, false, true, g6Var);
        this.V2 = runnable;
    }

    @Override
    public final void dismissInternal() {
        super.dismissInternal();
        Runnable runnable = this.V2;
        if (runnable != null) {
            runnable.run();
        }
    }
}
