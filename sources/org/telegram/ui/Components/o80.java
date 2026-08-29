package org.telegram.ui.Components;

import android.content.Context;
public final class o80 extends gi0 {
    public final r80 f31282n;

    public o80(r80 r80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f31282n = r80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f31282n.A = null;
    }
}
