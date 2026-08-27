package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;

public final class qt extends Dialog {

    public final ag.r2 f31972a;

    public qt(ag.r2 r2Var, Context context) {
        super(context);
        this.f31972a = r2Var;
    }

    @Override
    public final void dismiss() {
        rt rtVar = (rt) this.f31972a.f637b;
        rtVar.f32264a.k(false);
        rtVar.f32264a.e();
    }
}
