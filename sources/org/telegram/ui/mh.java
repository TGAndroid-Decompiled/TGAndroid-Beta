package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class mh extends org.telegram.ui.Components.bv {
    public final nh R1;

    public mh(nh nhVar, org.telegram.ui.ActionBar.h2 h2Var, Activity activity, org.telegram.ui.ActionBar.i6 i6Var, ArrayList arrayList) {
        super(h2Var, activity, i6Var, arrayList);
        this.R1 = nhVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bn bnVar = this.R1.f50183p;
        bnVar.getClass();
        bnVar.x8(false, true, 0.0f);
    }
}
