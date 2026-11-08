package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ht extends Dialog {
    public final bi.w4 f34337a;

    public ht(bi.w4 w4Var, Context context) {
        super(context);
        this.f34337a = w4Var;
    }

    @Override
    public final void dismiss() {
        jt jtVar = (jt) this.f34337a.f4962b;
        jtVar.f35091a.k(false);
        jtVar.f35091a.e();
    }
}
