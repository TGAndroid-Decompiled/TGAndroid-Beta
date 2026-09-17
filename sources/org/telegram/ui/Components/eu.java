package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class eu extends Dialog {
    public final bi.l3 f25786a;

    public eu(bi.l3 l3Var, Context context) {
        super(context);
        this.f25786a = l3Var;
    }

    @Override
    public final void dismiss() {
        fu fuVar = (fu) this.f25786a.f3240b;
        fuVar.f26184a.k(false);
        fuVar.f26184a.e();
    }
}
