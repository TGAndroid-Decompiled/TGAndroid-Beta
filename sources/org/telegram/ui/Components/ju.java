package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ju extends Dialog {
    public final ai.y3 f25548a;

    public ju(ai.y3 y3Var, Context context) {
        super(context);
        this.f25548a = y3Var;
    }

    @Override
    public final void dismiss() {
        ku kuVar = (ku) this.f25548a.f1751b;
        kuVar.f25825a.k(false);
        kuVar.f25825a.e();
    }
}
