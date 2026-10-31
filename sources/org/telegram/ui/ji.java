package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ji extends org.telegram.ui.Components.cv {
    public final ki N1;

    public ji(ki kiVar, org.telegram.ui.ActionBar.k2 k2Var, Activity activity, org.telegram.ui.ActionBar.p6 p6Var, ArrayList arrayList) {
        super(k2Var, activity, p6Var, arrayList);
        this.N1 = kiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        un unVar = this.N1.f38872p;
        unVar.getClass();
        unVar.o8(false, true, 0.0f);
    }
}
