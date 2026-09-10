package org.telegram.ui.Components;

import android.content.Context;
public final class c90 extends ti0 {
    public final f90 f22054n;

    public c90(f90 f90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f22054n = f90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f22054n.E = null;
    }
}
