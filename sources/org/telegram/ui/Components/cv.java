package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class cv extends rv {
    public final rv W;

    public cv(rv rvVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(n2Var, context, f6Var, arrayList);
        this.W = rvVar;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
