package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class gu extends Dialog {
    public final ai.y3 f24455a;

    public gu(ai.y3 y3Var, Context context) {
        super(context);
        this.f24455a = y3Var;
    }

    @Override
    public final void dismiss() {
        hu huVar = (hu) this.f24455a.f1749b;
        huVar.f24759a.k(false);
        huVar.f24759a.e();
    }
}
