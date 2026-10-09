package org.telegram.ui.Components;

import android.content.Context;
public final class u90 extends oj0 {
    public final x90 f31399n;

    public u90(x90 x90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f31399n = x90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f31399n.E = null;
    }
}
