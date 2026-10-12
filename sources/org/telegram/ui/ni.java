package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ni extends org.telegram.ui.Components.lw {
    public final eo W;

    public ni(eo eoVar, org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(m2Var, activity, c6Var, arrayList);
        this.W = eoVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        eo eoVar = this.W;
        eoVar.getClass();
        eoVar.j8(false, true, 0.0f);
    }
}
