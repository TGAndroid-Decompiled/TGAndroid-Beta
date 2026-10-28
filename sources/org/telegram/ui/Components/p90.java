package org.telegram.ui.Components;

import android.content.Context;
public final class p90 extends jj0 {
    public final s90 f31532s;

    public p90(s90 s90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f31532s = s90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f31532s.E = null;
    }
}
