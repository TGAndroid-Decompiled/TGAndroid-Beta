package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ki extends org.telegram.ui.Components.sv {
    public final bo W;

    public ki(bo boVar, org.telegram.ui.ActionBar.o2 o2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(o2Var, activity, f6Var, arrayList);
        this.W = boVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bo boVar = this.W;
        boVar.getClass();
        boVar.g8(false, true, 0.0f);
    }
}
