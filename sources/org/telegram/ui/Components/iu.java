package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class iu extends Dialog {
    public final ai.y3 f25228a;

    public iu(ai.y3 y3Var, Context context) {
        super(context);
        this.f25228a = y3Var;
    }

    @Override
    public final void dismiss() {
        ju juVar = (ju) this.f25228a.f1746b;
        juVar.f25544a.k(false);
        juVar.f25544a.e();
    }
}
