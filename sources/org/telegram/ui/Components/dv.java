package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class dv extends sv {
    public final sv W;

    public dv(sv svVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(o2Var, context, f6Var, arrayList);
        this.W = svVar;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
