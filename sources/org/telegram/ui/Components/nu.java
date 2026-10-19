package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class nu extends Dialog {
    public final ai.z4 f28840a;

    public nu(ai.z4 z4Var, Context context) {
        super(context);
        this.f28840a = z4Var;
    }

    @Override
    public final void dismiss() {
        ou ouVar = (ou) this.f28840a.f2529b;
        ouVar.f29095a.k(false);
        ouVar.f29095a.e();
    }
}
