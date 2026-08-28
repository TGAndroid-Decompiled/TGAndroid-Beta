package org.telegram.ui.Components;

import android.content.Context;
public final class t21 extends z21 {
    public final Runnable P;

    public t21(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.P = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
