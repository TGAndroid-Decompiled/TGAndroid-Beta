package org.telegram.ui.Components;

import android.content.Context;
public final class g80 extends nh0 {
    public final j80 f26288q1;

    public g80(j80 j80Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f26288q1 = j80Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f26288q1.E = null;
    }
}
