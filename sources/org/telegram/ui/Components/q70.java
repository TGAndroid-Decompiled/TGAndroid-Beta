package org.telegram.ui.Components;

import android.content.Context;
public final class q70 extends og0 {
    public final t70 f38536u1;

    public q70(t70 t70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f38536u1 = t70Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f38536u1.F = null;
    }
}
