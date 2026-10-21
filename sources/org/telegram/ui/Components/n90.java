package org.telegram.ui.Components;

import android.content.Context;
public final class n90 extends gj0 {
    public final q90 f28730n;

    public n90(q90 q90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f28730n = q90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f28730n.E = null;
    }
}
