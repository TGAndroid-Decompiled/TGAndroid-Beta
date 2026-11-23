package org.telegram.ui.Components;

import android.content.Context;
public final class a80 extends zg0 {
    public final d80 f33383u1;

    public a80(d80 d80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f33383u1 = d80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f33383u1.F = null;
    }
}
