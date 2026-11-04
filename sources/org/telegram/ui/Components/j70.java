package org.telegram.ui.Components;

import android.content.Context;
public final class j70 extends og0 {
    public final m70 f34979r1;

    public j70(m70 m70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f34979r1 = m70Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f34979r1.F = null;
    }
}
