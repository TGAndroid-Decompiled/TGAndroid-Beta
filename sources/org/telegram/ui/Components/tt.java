package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class tt extends Dialog {
    public final bi.y8 f40097a;

    public tt(bi.y8 y8Var, Context context) {
        super(context);
        this.f40097a = y8Var;
    }

    @Override
    public final void dismiss() {
        ut utVar = (ut) this.f40097a.f4255b;
        utVar.f40413a.k(false);
        utVar.f40413a.e();
    }
}
