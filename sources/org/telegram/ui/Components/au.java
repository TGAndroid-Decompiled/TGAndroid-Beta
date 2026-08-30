package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class au extends Dialog {
    public final eg.y1 f23508a;

    public au(eg.y1 y1Var, Context context) {
        super(context);
        this.f23508a = y1Var;
    }

    @Override
    public final void dismiss() {
        bu buVar = (bu) this.f23508a.f5583b;
        buVar.f23749a.k(false);
        buVar.f23749a.e();
    }
}
