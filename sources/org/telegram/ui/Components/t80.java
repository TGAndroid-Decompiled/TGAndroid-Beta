package org.telegram.ui.Components;

import android.content.Context;
public final class t80 extends ki0 {
    public final w80 f28112n;

    public t80(w80 w80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f28112n = w80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f28112n.E = null;
    }
}
