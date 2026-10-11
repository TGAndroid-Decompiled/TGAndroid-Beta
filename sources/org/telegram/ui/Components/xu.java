package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class xu extends Dialog {
    public final ai.z3 f33070a;

    public xu(ai.z3 z3Var, Context context) {
        super(context);
        this.f33070a = z3Var;
    }

    @Override
    public final void dismiss() {
        yu yuVar = (yu) this.f33070a.f2003b;
        yuVar.f33461a.k(false);
        yuVar.f33461a.e();
    }
}
