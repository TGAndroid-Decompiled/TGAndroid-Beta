package org.telegram.ui.Components;

import android.content.Context;
public final class y90 extends rj0 {
    public final ba0 f33005n;

    public y90(ba0 ba0Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f33005n = ba0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f33005n.E = null;
    }
}
