package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class pu extends cv {
    public final cv N1;

    public pu(cv cvVar, org.telegram.ui.ActionBar.k2 k2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, ArrayList arrayList) {
        super(k2Var, context, p6Var, arrayList);
        this.N1 = cvVar;
    }

    @Override
    public final void L0() {
        this.N1.dismiss();
    }
}
