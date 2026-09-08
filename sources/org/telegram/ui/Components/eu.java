package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class eu extends Dialog {
    public final bi.l3 f25812a;

    public eu(bi.l3 l3Var, Context context) {
        super(context);
        this.f25812a = l3Var;
    }

    @Override
    public final void dismiss() {
        fu fuVar = (fu) this.f25812a.f3267b;
        fuVar.f26210a.k(false);
        fuVar.f26210a.e();
    }
}
