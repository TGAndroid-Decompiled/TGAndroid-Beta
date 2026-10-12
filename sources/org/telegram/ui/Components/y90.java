package org.telegram.ui.Components;

import android.content.Context;
public final class y90 extends qj0 {
    public final ba0 f33012n;

    public y90(ba0 ba0Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f33012n = ba0Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f33012n.E = null;
    }
}
