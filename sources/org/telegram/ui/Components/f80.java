package org.telegram.ui.Components;

import android.content.Context;

public final class f80 extends yh0 {

    public final i80 f28294n;

    public f80(i80 i80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f28294n = i80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f28294n.A = null;
    }
}
