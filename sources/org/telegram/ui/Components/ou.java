package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class ou extends dv {
    public final dv S;

    public ou(dv dvVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, ArrayList arrayList) {
        super(o2Var, context, b6Var, arrayList);
        this.S = dvVar;
    }

    @Override
    public final void X() {
        this.S.dismiss();
    }
}
