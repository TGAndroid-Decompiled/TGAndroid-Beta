package org.telegram.ui.Components;

import android.content.Context;
public final class dt0 extends su0 {
    public final yu0 h;

    public dt0(yu0 yu0Var, Context context) {
        super(yu0Var, context);
        this.h = yu0Var;
    }

    @Override
    public final void l() {
        super.l();
        yu0 yu0Var = this.h;
        rt0 W = yu0Var.W(0);
        if (W != null && W.f27688r.getVisibility() == 0) {
            yu0Var.I.l();
        }
    }
}
