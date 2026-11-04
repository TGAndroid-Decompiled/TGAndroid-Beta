package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ft extends Dialog {
    public final ai.c7 f33865a;

    public ft(ai.c7 c7Var, Context context) {
        super(context);
        this.f33865a = c7Var;
    }

    @Override
    public final void dismiss() {
        gt gtVar = (gt) this.f33865a.f553b;
        gtVar.f34185a.k(false);
        gtVar.f34185a.e();
    }
}
