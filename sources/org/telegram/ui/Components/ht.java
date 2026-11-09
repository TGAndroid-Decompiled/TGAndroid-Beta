package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ht extends Dialog {
    public final bi.w4 f34373a;

    public ht(bi.w4 w4Var, Context context) {
        super(context);
        this.f34373a = w4Var;
    }

    @Override
    public final void dismiss() {
        jt jtVar = (jt) this.f34373a.f4960b;
        jtVar.f35129a.k(false);
        jtVar.f35129a.e();
    }
}
