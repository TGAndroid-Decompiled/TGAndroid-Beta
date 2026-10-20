package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class nu extends Dialog {
    public final ai.a5 f28874a;

    public nu(ai.a5 a5Var, Context context) {
        super(context);
        this.f28874a = a5Var;
    }

    @Override
    public final void dismiss() {
        ou ouVar = (ou) this.f28874a.f957b;
        ouVar.f29141a.k(false);
        ouVar.f29141a.e();
    }
}
