package org.telegram.ui.Components;

import android.content.Context;
public final class v90 extends qj0 {
    public final y90 f31709n;

    public v90(y90 y90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f31709n = y90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f31709n.E = null;
    }
}
