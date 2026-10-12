package org.telegram.ui.Components;

import android.content.Context;
public final class t90 extends kj0 {
    public final w90 f29314n;

    public t90(w90 w90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f29314n = w90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f29314n.E = null;
    }
}
