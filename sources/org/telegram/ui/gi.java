package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class gi extends org.telegram.ui.Components.jw {
    public final hi W;

    public gi(hi hiVar, org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, activity, d6Var, arrayList);
        this.W = hiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.W.f38445p;
        znVar.getClass();
        znVar.j8(false, true, 0.0f);
    }
}
