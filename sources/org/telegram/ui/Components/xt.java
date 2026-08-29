package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class xt extends Dialog {
    public final cg.z1 f34828a;

    public xt(cg.z1 z1Var, Context context) {
        super(context);
        this.f34828a = z1Var;
    }

    @Override
    public final void dismiss() {
        yt ytVar = (yt) this.f34828a.f3472b;
        ytVar.f35130a.k(false);
        ytVar.f35130a.e();
    }
}
