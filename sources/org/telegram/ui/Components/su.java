package org.telegram.ui.Components;

import android.app.Dialog;
import android.content.Context;
public final class su extends Dialog {
    public final bi.o3 f29213a;

    public su(bi.o3 o3Var, Context context) {
        super(context);
        this.f29213a = o3Var;
    }

    @Override
    public final void dismiss() {
        tu tuVar = (tu) this.f29213a.f3406b;
        tuVar.f29489a.k(false);
        tuVar.f29489a.e();
    }
}
