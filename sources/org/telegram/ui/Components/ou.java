package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ou extends Dialog {
    public final bi.v4 f31379a;

    public ou(bi.v4 v4Var, Context context) {
        super(context);
        this.f31379a = v4Var;
    }

    @Override
    public final void dismiss() {
        pu puVar = (pu) this.f31379a.f5553b;
        puVar.f31704a.k(false);
        puVar.f31704a.e();
    }
}
