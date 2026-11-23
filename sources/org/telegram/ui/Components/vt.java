package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class vt extends Dialog {
    public final bi.b9 f41559a;

    public vt(bi.b9 b9Var, Context context) {
        super(context);
        this.f41559a = b9Var;
    }

    @Override
    public final void dismiss() {
        wt wtVar = (wt) this.f41559a.f3450b;
        wtVar.f41892a.k(false);
        wtVar.f41892a.e();
    }
}
