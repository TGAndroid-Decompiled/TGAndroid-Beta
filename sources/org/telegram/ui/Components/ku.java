package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ku extends Dialog {
    public final bi.o1 f24812a;

    public ku(bi.o1 o1Var, Context context) {
        super(context);
        this.f24812a = o1Var;
    }

    @Override
    public final void dismiss() {
        lu luVar = (lu) this.f24812a.f3298b;
        luVar.f25112a.k(false);
        luVar.f25112a.e();
    }
}
