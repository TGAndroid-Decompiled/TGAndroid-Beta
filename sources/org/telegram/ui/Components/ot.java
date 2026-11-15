package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ot extends Dialog {
    public final bi.t6 f38074a;

    public ot(bi.t6 t6Var, Context context) {
        super(context);
        this.f38074a = t6Var;
    }

    @Override
    public final void dismiss() {
        pt ptVar = (pt) this.f38074a.f3885b;
        ptVar.f38408a.k(false);
        ptVar.f38408a.e();
    }
}
