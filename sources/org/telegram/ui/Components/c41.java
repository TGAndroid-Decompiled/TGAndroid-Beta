package org.telegram.ui.Components;

import android.content.Context;
public final class c41 extends i41 {
    public final Runnable T;

    public c41(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.T;
        if (runnable != null) {
            runnable.run();
        }
    }
}
