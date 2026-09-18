package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class gu extends Dialog {
    public final ai.y3 f24400a;

    public gu(ai.y3 y3Var, Context context) {
        super(context);
        this.f24400a = y3Var;
    }

    @Override
    public final void dismiss() {
        hu huVar = (hu) this.f24400a.f1749b;
        huVar.f24741a.k(false);
        huVar.f24741a.e();
    }
}
