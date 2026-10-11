package org.telegram.ui.Components;

import android.content.Context;
public final class u90 extends pj0 {
    public final x90 f31482n;

    public u90(x90 x90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f31482n = x90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f31482n.E = null;
    }
}
