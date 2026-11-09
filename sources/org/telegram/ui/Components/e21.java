package org.telegram.ui.Components;

import android.content.Context;
public final class e21 extends l21 {
    public final Runnable Q1;

    public e21(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.Q1 = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.Q1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
