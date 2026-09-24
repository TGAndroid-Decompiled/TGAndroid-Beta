package org.telegram.ui.Components;

import android.content.Context;
public final class d90 extends ui0 {
    public final g90 f23536n;

    public d90(g90 g90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f23536n = g90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f23536n.E = null;
    }
}
