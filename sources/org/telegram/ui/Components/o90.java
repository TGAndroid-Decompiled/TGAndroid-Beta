package org.telegram.ui.Components;

import android.content.Context;
public final class o90 extends ij0 {
    public final r90 f31234s;

    public o90(r90 r90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f31234s = r90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f31234s.E = null;
    }
}
