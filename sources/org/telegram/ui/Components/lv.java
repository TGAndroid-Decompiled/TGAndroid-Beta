package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class lv extends aw {
    public final aw W;

    public lv(aw awVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, context, d6Var, arrayList);
        this.W = awVar;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
