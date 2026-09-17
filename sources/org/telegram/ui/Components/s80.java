package org.telegram.ui.Components;

import android.content.Context;
public final class s80 extends ki0 {
    public final v80 f27803n;

    public s80(v80 v80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f27803n = v80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f27803n.E = null;
    }
}
