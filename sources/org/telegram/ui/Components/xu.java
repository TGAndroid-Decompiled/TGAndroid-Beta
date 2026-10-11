package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class xu extends Dialog {
    public final ai.z3 f33030a;

    public xu(ai.z3 z3Var, Context context) {
        super(context);
        this.f33030a = z3Var;
    }

    @Override
    public final void dismiss() {
        yu yuVar = (yu) this.f33030a.f2003b;
        yuVar.f33336a.k(false);
        yuVar.f33336a.e();
    }
}
