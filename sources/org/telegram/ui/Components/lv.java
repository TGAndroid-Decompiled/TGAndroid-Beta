package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class lv extends aw {
    public final aw W;

    public lv(aw awVar, org.telegram.ui.ActionBar.r2 r2Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, ArrayList arrayList) {
        super(r2Var, context, u6Var, arrayList);
        this.W = awVar;
    }

    @Override
    public final void i0() {
        this.W.dismiss();
    }
}
