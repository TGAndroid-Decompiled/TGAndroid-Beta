package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class fi extends org.telegram.ui.Components.tv {
    public final gi W;

    public fi(gi giVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(n2Var, activity, f6Var, arrayList);
        this.W = giVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.W.f33903p;
        znVar.getClass();
        znVar.g8(false, true, 0.0f);
    }
}
