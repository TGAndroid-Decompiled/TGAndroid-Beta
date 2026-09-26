package org.telegram.ui.Components;

import android.content.Context;
public final class e90 extends vi0 {
    public final h90 f23889n;

    public e90(h90 h90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f23889n = h90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f23889n.E = null;
    }
}
