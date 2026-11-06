package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class nh extends org.telegram.ui.Components.qu {
    public final oh N1;

    public nh(oh ohVar, org.telegram.ui.ActionBar.f2 f2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(f2Var, activity, f6Var, arrayList);
        this.N1 = ohVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        an anVar = this.N1.f48412p;
        anVar.getClass();
        anVar.v8(false, true, 0.0f);
    }
}
