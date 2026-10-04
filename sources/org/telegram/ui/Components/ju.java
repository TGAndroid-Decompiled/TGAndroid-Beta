package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ju extends Dialog {
    public final ai.y3 f27896a;

    public ju(ai.y3 y3Var, Context context) {
        super(context);
        this.f27896a = y3Var;
    }

    @Override
    public final void dismiss() {
        ku kuVar = (ku) this.f27896a.f1897b;
        kuVar.f28199a.k(false);
        kuVar.f28199a.e();
    }
}
