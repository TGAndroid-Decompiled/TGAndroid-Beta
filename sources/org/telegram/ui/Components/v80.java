package org.telegram.ui.Components;

import android.content.Context;
public final class v80 extends si0 {
    public final y80 f31829n;

    public v80(y80 y80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f31829n = y80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f31829n.B = null;
    }
}
