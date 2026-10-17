package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class nu extends Dialog {
    public final ai.z4 f28819a;

    public nu(ai.z4 z4Var, Context context) {
        super(context);
        this.f28819a = z4Var;
    }

    @Override
    public final void dismiss() {
        ou ouVar = (ou) this.f28819a.f2522b;
        ouVar.f29068a.k(false);
        ouVar.f29068a.e();
    }
}
