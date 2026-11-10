package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class gt extends Dialog {
    public final bi.w4 f33974a;

    public gt(bi.w4 w4Var, Context context) {
        super(context);
        this.f33974a = w4Var;
    }

    @Override
    public final void dismiss() {
        ht htVar = (ht) this.f33974a.f4964b;
        htVar.f34459a.k(false);
        htVar.f34459a.e();
    }
}
