package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class nh extends org.telegram.ui.Components.ev {
    public final oh R1;

    public nh(oh ohVar, org.telegram.ui.ActionBar.g2 g2Var, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(g2Var, activity, h6Var, arrayList);
        this.R1 = ohVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bn bnVar = this.R1.f50606p;
        bnVar.getClass();
        bnVar.x8(false, true, 0.0f);
    }
}
