package org.telegram.ui.Components;

import android.content.Context;
public final class dt0 extends tu0 {
    public final zu0 h;

    public dt0(zu0 zu0Var, Context context) {
        super(zu0Var, context);
        this.h = zu0Var;
    }

    @Override
    public final void l() {
        super.l();
        zu0 zu0Var = this.h;
        rt0 W = zu0Var.W(0);
        if (W != null && W.f30850r.getVisibility() == 0) {
            zu0Var.F.l();
        }
    }
}
