package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class lu extends Dialog {
    public final ai.a5 f28436a;

    public lu(ai.a5 a5Var, Context context) {
        super(context);
        this.f28436a = a5Var;
    }

    @Override
    public final void dismiss() {
        mu muVar = (mu) this.f28436a.f958b;
        muVar.f28697a.k(false);
        muVar.f28697a.e();
    }
}
