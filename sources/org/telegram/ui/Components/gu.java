package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class gu extends Dialog {
    public final ai.y3 f24456a;

    public gu(ai.y3 y3Var, Context context) {
        super(context);
        this.f24456a = y3Var;
    }

    @Override
    public final void dismiss() {
        hu huVar = (hu) this.f24456a.f1744b;
        huVar.f24802a.k(false);
        huVar.f24802a.e();
    }
}
