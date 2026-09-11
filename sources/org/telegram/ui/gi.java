package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class gi extends org.telegram.ui.Components.rv {
    public final hi W;

    public gi(hi hiVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(n2Var, activity, f6Var, arrayList);
        this.W = hiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        co coVar = this.W.f37034p;
        coVar.getClass();
        coVar.g8(false, true, 0.0f);
    }
}
