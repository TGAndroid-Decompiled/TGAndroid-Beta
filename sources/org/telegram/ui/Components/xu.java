package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class xu extends Dialog {
    public final ai.z3 f33032a;

    public xu(ai.z3 z3Var, Context context) {
        super(context);
        this.f33032a = z3Var;
    }

    @Override
    public final void dismiss() {
        yu yuVar = (yu) this.f33032a.f2003b;
        yuVar.f33407a.k(false);
        yuVar.f33407a.e();
    }
}
