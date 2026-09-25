package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class ev extends tv {
    public final tv W;

    public ev(tv tvVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, context, d6Var, arrayList);
        this.W = tvVar;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
