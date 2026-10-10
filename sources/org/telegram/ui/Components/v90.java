package org.telegram.ui.Components;

import android.content.Context;
public final class v90 extends pj0 {
    public final y90 f31754n;

    public v90(y90 y90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f31754n = y90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f31754n.E = null;
    }
}
