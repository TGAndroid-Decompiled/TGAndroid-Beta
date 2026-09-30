package org.telegram.ui.Components;

import android.content.Context;
public final class g90 extends xi0 {
    public final j90 f24480n;

    public g90(j90 j90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f24480n = j90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f24480n.E = null;
    }
}
