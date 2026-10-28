package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class bi extends org.telegram.ui.Components.aw {
    public final ci W;

    public bi(ci ciVar, org.telegram.ui.ActionBar.r2 r2Var, Activity activity, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(r2Var, activity, u6Var, arrayList);
        this.W = ciVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        wn wnVar = this.W.f38367p;
        wnVar.getClass();
        wnVar.p8(false, true, 0.0f);
    }
}
