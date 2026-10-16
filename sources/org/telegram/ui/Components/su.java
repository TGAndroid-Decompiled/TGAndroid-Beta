package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class su extends Dialog {
    public final bi.o3 f28913a;

    public su(bi.o3 o3Var, Context context) {
        super(context);
        this.f28913a = o3Var;
    }

    @Override
    public final void dismiss() {
        tu tuVar = (tu) this.f28913a.f3410b;
        tuVar.f29192a.k(false);
        tuVar.f29192a.e();
    }
}
