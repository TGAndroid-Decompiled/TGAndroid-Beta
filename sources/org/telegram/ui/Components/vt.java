package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class vt extends Dialog {
    public final bi.b9 f41558a;

    public vt(bi.b9 b9Var, Context context) {
        super(context);
        this.f41558a = b9Var;
    }

    @Override
    public final void dismiss() {
        wt wtVar = (wt) this.f41558a.f3450b;
        wtVar.f41891a.k(false);
        wtVar.f41891a.e();
    }
}
