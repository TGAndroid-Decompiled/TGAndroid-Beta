package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class gi extends org.telegram.ui.Components.jw {
    public final hi W;

    public gi(hi hiVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, activity, e6Var, arrayList);
        this.W = hiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.W.f38394p;
        znVar.getClass();
        znVar.j8(false, true, 0.0f);
    }
}
