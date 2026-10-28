package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class li extends org.telegram.ui.Components.aw {
    public final wn W;

    public li(wn wnVar, org.telegram.ui.ActionBar.r2 r2Var, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(r2Var, activity, u6Var, arrayList);
        this.W = wnVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        wn wnVar = this.W;
        wnVar.getClass();
        wnVar.p8(false, true, 0.0f);
    }
}
