package org.telegram.ui.Components;

import android.content.Context;
public final class d80 extends ah0 {
    public final g80 f34405u1;

    public d80(g80 g80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f34405u1 = g80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f34405u1.F = null;
    }
}
