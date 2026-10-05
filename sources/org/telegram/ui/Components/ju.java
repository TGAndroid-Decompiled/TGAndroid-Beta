package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class ju extends Dialog {
    public final ai.y3 f27970a;

    public ju(ai.y3 y3Var, Context context) {
        super(context);
        this.f27970a = y3Var;
    }

    @Override
    public final void dismiss() {
        ku kuVar = (ku) this.f27970a.f1897b;
        kuVar.f28291a.k(false);
        kuVar.f28291a.e();
    }
}
