package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ci extends org.telegram.ui.Components.ov {
    public final di T;

    public ci(di diVar, org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(p2Var, activity, g6Var, arrayList);
        this.T = diVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        xn xnVar = this.T.f36211p;
        xnVar.getClass();
        xnVar.g8(false, true, 0.0f);
    }
}
