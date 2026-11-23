package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class mh extends org.telegram.ui.Components.dv {
    public final nh R1;

    public mh(nh nhVar, org.telegram.ui.ActionBar.g2 g2Var, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(g2Var, activity, h6Var, arrayList);
        this.R1 = nhVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bn bnVar = this.R1.f50198p;
        bnVar.getClass();
        bnVar.x8(false, true, 0.0f);
    }
}
