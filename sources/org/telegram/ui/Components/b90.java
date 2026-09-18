package org.telegram.ui.Components;

import android.content.Context;
public final class b90 extends ui0 {
    public final e90 f22898n;

    public b90(e90 e90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f22898n = e90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f22898n.E = null;
    }
}
