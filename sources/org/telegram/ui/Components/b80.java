package org.telegram.ui.Components;

import android.content.Context;
public final class b80 extends yg0 {
    public final e80 f33587u1;

    public b80(e80 e80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f33587u1 = e80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f33587u1.F = null;
    }
}
