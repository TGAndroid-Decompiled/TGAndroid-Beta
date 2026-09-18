package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class dv extends sv {
    public final sv W;

    public dv(sv svVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(n2Var, context, e6Var, arrayList);
        this.W = svVar;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
