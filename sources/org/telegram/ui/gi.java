package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class gi extends org.telegram.ui.Components.sv {
    public final hi W;

    public gi(hi hiVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, activity, e6Var, arrayList);
        this.W = hiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bo boVar = this.W.f34293p;
        boVar.getClass();
        boVar.g8(false, true, 0.0f);
    }
}
