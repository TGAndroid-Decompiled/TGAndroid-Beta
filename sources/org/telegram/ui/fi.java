package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class fi extends org.telegram.ui.Components.ov {
    public final xn T;

    public fi(xn xnVar, org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(p2Var, activity, g6Var, arrayList);
        this.T = xnVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        xn xnVar = this.T;
        xnVar.getClass();
        xnVar.g8(false, true, 0.0f);
    }
}
