package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class nu extends Dialog {
    public final ai.a5 f28838a;

    public nu(ai.a5 a5Var, Context context) {
        super(context);
        this.f28838a = a5Var;
    }

    @Override
    public final void dismiss() {
        ou ouVar = (ou) this.f28838a.f957b;
        ouVar.f29093a.k(false);
        ouVar.f29093a.e();
    }
}
