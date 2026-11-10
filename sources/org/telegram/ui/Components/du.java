package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class du extends qu {
    public final qu Q1;

    public du(qu quVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.h6 h6Var, ArrayList arrayList) {
        super(f2Var, context, h6Var, arrayList);
        this.Q1 = quVar;
    }

    @Override
    public final void L0() {
        this.Q1.dismiss();
    }
}
