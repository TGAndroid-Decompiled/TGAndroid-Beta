package org.telegram.ui.Components;

import android.content.Context;
public final class t21 extends a31 {
    public final Runnable U1;

    public t21(Context context, String str, String str2, CharSequence charSequence, Runnable runnable) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.U1 = runnable;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        Runnable runnable = this.U1;
        if (runnable != null) {
            runnable.run();
        }
    }
}
