package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class oi extends org.telegram.ui.Components.sv {
    public final zn W;

    public oi(zn znVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, activity, e6Var, arrayList);
        this.W = znVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.W;
        znVar.getClass();
        znVar.g8(false, true, 0.0f);
    }
}
