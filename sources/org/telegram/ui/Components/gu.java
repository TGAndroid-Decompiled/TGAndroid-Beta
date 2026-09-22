package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class gu extends Dialog {
    public final ai.y3 f24622a;

    public gu(ai.y3 y3Var, Context context) {
        super(context);
        this.f24622a = y3Var;
    }

    @Override
    public final void dismiss() {
        hu huVar = (hu) this.f24622a.f1746b;
        huVar.f24891a.k(false);
        huVar.f24891a.e();
    }
}
