package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class nu extends Dialog {
    public final ai.a5 f28878a;

    public nu(ai.a5 a5Var, Context context) {
        super(context);
        this.f28878a = a5Var;
    }

    @Override
    public final void dismiss() {
        ou ouVar = (ou) this.f28878a.f957b;
        ouVar.f29145a.k(false);
        ouVar.f29145a.e();
    }
}
