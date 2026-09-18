package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class fi extends org.telegram.ui.Components.sv {
    public final gi W;

    public fi(gi giVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, activity, e6Var, arrayList);
        this.W = giVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.W.f33876p;
        znVar.getClass();
        znVar.g8(false, true, 0.0f);
    }
}
