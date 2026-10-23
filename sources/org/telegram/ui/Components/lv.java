package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class lv extends aw {
    public final aw W;

    public lv(aw awVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(o2Var, context, g6Var, arrayList);
        this.W = awVar;
    }

    @Override
    public final void i0() {
        this.W.dismiss();
    }
}
