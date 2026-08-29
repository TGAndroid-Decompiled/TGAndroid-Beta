package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class uu extends jv {
    public final jv S;

    public uu(jv jvVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, ArrayList arrayList) {
        super(o2Var, context, c6Var, arrayList);
        this.S = jvVar;
    }

    @Override
    public final void Y() {
        this.S.dismiss();
    }
}
