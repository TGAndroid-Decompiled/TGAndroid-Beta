package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class du extends qu {
    public final qu N1;

    public du(qu quVar, org.telegram.ui.ActionBar.f2 f2Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(f2Var, context, f6Var, arrayList);
        this.N1 = quVar;
    }

    @Override
    public final void L0() {
        this.N1.dismiss();
    }
}
