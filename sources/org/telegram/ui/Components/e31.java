package org.telegram.ui.Components;

import android.content.Context;
public final class e31 extends k31 {
    public final Runnable P;

    public e31(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
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
