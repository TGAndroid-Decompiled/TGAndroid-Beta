package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class gt extends Dialog {
    public final bi.w4 f34040a;

    public gt(bi.w4 w4Var, Context context) {
        super(context);
        this.f34040a = w4Var;
    }

    @Override
    public final void dismiss() {
        ht htVar = (ht) this.f34040a.f4962b;
        htVar.f34412a.k(false);
        htVar.f34412a.e();
    }
}
