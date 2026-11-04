package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class jh extends org.telegram.ui.Components.pu {
    public final kh O1;

    public jh(kh khVar, org.telegram.ui.ActionBar.d2 d2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(d2Var, activity, e6Var, arrayList);
        this.O1 = khVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        wm wmVar = this.O1.f46947p;
        wmVar.getClass();
        wmVar.v8(false, true, 0.0f);
    }
}
