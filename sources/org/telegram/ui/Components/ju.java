package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class ju extends wu {
    public final wu R1;

    public ju(wu wuVar, org.telegram.ui.ActionBar.e2 e2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(e2Var, context, e6Var, arrayList);
        this.R1 = wuVar;
    }

    @Override
    public final void L0() {
        this.R1.dismiss();
    }
}
