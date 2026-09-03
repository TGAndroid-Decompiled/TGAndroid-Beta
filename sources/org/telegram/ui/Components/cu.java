package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class cu extends Dialog {
    public final fg.x1 f26040a;

    public cu(fg.x1 x1Var, Context context) {
        super(context);
        this.f26040a = x1Var;
    }

    @Override
    public final void dismiss() {
        du duVar = (du) this.f26040a.f6626b;
        duVar.f26364a.k(false);
        duVar.f26364a.e();
    }
}
