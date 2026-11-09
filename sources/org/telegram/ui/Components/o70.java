package org.telegram.ui.Components;

import android.content.Context;
public final class o70 extends mg0 {
    public final r70 f36663q1;

    public o70(r70 r70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f36663q1 = r70Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f36663q1.E = null;
    }
}
