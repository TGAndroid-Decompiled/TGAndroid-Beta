package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class vt extends Dialog {
    public final bi.c9 f41557a;

    public vt(bi.c9 c9Var, Context context) {
        super(context);
        this.f41557a = c9Var;
    }

    @Override
    public final void dismiss() {
        wt wtVar = (wt) this.f41557a.f3490b;
        wtVar.f41898a.k(false);
        wtVar.f41898a.e();
    }
}
