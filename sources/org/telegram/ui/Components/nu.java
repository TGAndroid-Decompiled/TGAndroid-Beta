package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class nu extends Dialog {
    public final ai.a5 f29013a;

    public nu(ai.a5 a5Var, Context context) {
        super(context);
        this.f29013a = a5Var;
    }

    @Override
    public final void dismiss() {
        ou ouVar = (ou) this.f29013a.f958b;
        ouVar.f29314a.k(false);
        ouVar.f29314a.e();
    }
}
