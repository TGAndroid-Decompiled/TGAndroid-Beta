package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class eu extends Dialog {
    public final bi.l3 f25813a;

    public eu(bi.l3 l3Var, Context context) {
        super(context);
        this.f25813a = l3Var;
    }

    @Override
    public final void dismiss() {
        fu fuVar = (fu) this.f25813a.f3267b;
        fuVar.f26211a.k(false);
        fuVar.f26211a.e();
    }
}
