package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class mi extends org.telegram.ui.Components.ev {
    public final bn R1;

    public mi(bn bnVar, org.telegram.ui.ActionBar.g2 g2Var, Activity activity, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(g2Var, activity, h6Var, arrayList);
        this.R1 = bnVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        bn bnVar = this.R1;
        bnVar.getClass();
        bnVar.x8(false, true, 0.0f);
    }
}
