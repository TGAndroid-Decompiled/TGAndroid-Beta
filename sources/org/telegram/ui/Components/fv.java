package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class fv extends uv {
    public final uv W;

    public fv(uv uvVar, org.telegram.ui.ActionBar.o2 o2Var, Context context, org.telegram.ui.ActionBar.e6 e6Var, ArrayList arrayList) {
        super(o2Var, context, e6Var, arrayList);
        this.W = uvVar;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
