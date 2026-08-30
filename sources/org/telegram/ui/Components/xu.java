package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class xu extends mv {
    public final mv T;

    public xu(mv mvVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, context, f6Var, arrayList);
        this.T = mvVar;
    }

    @Override
    public final void Y() {
        this.T.dismiss();
    }
}
