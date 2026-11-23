package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class vt extends Dialog {
    public final bi.e9 f41520a;

    public vt(bi.e9 e9Var, Context context) {
        super(context);
        this.f41520a = e9Var;
    }

    @Override
    public final void dismiss() {
        wt wtVar = (wt) this.f41520a.f3516b;
        wtVar.f41855a.k(false);
        wtVar.f41855a.e();
    }
}
