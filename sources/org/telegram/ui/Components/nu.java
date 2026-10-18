package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class nu extends Dialog {
    public final ai.z4 f28826a;

    public nu(ai.z4 z4Var, Context context) {
        super(context);
        this.f28826a = z4Var;
    }

    @Override
    public final void dismiss() {
        ou ouVar = (ou) this.f28826a.f2531b;
        ouVar.f29075a.k(false);
        ouVar.f29075a.e();
    }
}
