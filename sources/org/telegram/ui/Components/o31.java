package org.telegram.ui.Components;

import android.content.Context;
public final class o31 extends v31 {
    public final Runnable Q;

    public o31(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.Q = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Q;
        if (runnable != null) {
            runnable.run();
        }
    }
}
