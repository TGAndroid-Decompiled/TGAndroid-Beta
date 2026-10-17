package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ji extends org.telegram.ui.Components.aw {
    public final sn W;

    public ji(sn snVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = snVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        sn snVar = this.W;
        snVar.getClass();
        snVar.j8(false, true, 0.0f);
    }
}
