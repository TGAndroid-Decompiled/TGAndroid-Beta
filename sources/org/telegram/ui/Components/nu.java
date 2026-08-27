package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;

public final class nu extends cv {
    public final cv S;

    public nu(cv cvVar, org.telegram.ui.ActionBar.n2 n2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(n2Var, context, c6Var, arrayList);
        this.S = cvVar;
    }

    @Override
    public final void Y() {
        this.S.dismiss();
    }
}
