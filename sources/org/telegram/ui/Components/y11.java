package org.telegram.ui.Components;

import android.content.Context;
public final class y11 extends f21 {
    public final Runnable R1;

    public y11(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.R1 = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.R1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
