package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class zt extends Dialog {
    public final eg.y1 f31467a;

    public zt(eg.y1 y1Var, Context context) {
        super(context);
        this.f31467a = y1Var;
    }

    @Override
    public final void dismiss() {
        au auVar = (au) this.f31467a.f5572b;
        auVar.f23482a.k(false);
        auVar.f23482a.e();
    }
}
