package org.telegram.ui.Components;

import android.content.Context;
public final class a90 extends ti0 {
    public final d90 f22589n;

    public a90(d90 d90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f22589n = d90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f22589n.E = null;
    }
}
