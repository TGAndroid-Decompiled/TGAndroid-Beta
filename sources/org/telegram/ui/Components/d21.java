package org.telegram.ui.Components;

import android.content.Context;
public final class d21 extends k21 {
    public final Runnable T1;

    public d21(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T1 = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.T1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
