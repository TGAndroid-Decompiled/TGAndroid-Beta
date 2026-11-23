package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class tt extends Dialog {
    public final bi.e9 f40151a;

    public tt(bi.e9 e9Var, Context context) {
        super(context);
        this.f40151a = e9Var;
    }

    @Override
    public final void dismiss() {
        ut utVar = (ut) this.f40151a.f3516b;
        utVar.f40468a.k(false);
        utVar.f40468a.e();
    }
}
