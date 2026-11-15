package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class nh extends org.telegram.ui.Components.wu {
    public final oh R1;

    public nh(oh ohVar, org.telegram.ui.ActionBar.e2 e2Var, Activity activity, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(e2Var, activity, e6Var, arrayList);
        this.R1 = ohVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        an anVar = this.R1.f49959p;
        anVar.getClass();
        anVar.x8(false, true, 0.0f);
    }
}
