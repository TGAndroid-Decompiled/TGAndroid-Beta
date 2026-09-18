package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class gu extends Dialog {
    public final ai.y3 f24491a;

    public gu(ai.y3 y3Var, Context context) {
        super(context);
        this.f24491a = y3Var;
    }

    @Override
    public final void dismiss() {
        hu huVar = (hu) this.f24491a.f1749b;
        huVar.f24737a.k(false);
        huVar.f24737a.e();
    }
}
