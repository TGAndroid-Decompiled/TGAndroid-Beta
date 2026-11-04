package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class mh extends org.telegram.ui.Components.pu {
    public final wm O1;

    public mh(wm wmVar, org.telegram.ui.ActionBar.d2 d2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(d2Var, activity, e6Var, arrayList);
        this.O1 = wmVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        wm wmVar = this.O1;
        wmVar.getClass();
        wmVar.v8(false, true, 0.0f);
    }
}
