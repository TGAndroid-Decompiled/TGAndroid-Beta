package org.telegram.ui.Components;

import android.content.Context;
public final class u80 extends ri0 {
    public final x80 f29137n;

    public u80(x80 x80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f29137n = x80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f29137n.B = null;
    }
}
