package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class zu extends ov {
    public final ov T;

    public zu(ov ovVar, org.telegram.ui.ActionBar.p2 p2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, ArrayList arrayList) {
        super(p2Var, context, g6Var, arrayList);
        this.T = ovVar;
    }

    @Override
    public final void Y() {
        this.T.dismiss();
    }
}
