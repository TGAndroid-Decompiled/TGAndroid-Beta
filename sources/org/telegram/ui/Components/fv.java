package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class fv extends uv {
    public final uv W;

    public fv(uv uvVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, context, d6Var, arrayList);
        this.W = uvVar;
    }

    @Override
    public final void Y() {
        this.W.dismiss();
    }
}
