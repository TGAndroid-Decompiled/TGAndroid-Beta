package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class cu extends pu {
    public final pu O1;

    public cu(pu puVar, org.telegram.ui.ActionBar.d2 d2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(d2Var, context, e6Var, arrayList);
        this.O1 = puVar;
    }

    @Override
    public final void L0() {
        this.O1.dismiss();
    }
}
