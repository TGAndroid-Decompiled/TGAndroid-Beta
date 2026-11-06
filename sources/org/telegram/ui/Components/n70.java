package org.telegram.ui.Components;

import android.content.Context;
public final class n70 extends lg0 {
    public final q70 f36244q1;

    public n70(q70 q70Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f36244q1 = q70Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f36244q1.E = null;
    }
}
