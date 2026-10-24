package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class jv extends yv {
    public final yv W;

    public jv(yv yvVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(o2Var, context, g6Var, arrayList);
        this.W = yvVar;
    }

    @Override
    public final void i0() {
        this.W.dismiss();
    }
}
