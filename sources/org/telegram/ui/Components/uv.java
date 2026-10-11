package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class uv extends jw {
    public final jw W;

    public uv(jw jwVar, org.telegram.ui.ActionBar.m2 m2Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, context, d6Var, arrayList);
        this.W = jwVar;
    }

    @Override
    public final void Z() {
        this.W.dismiss();
    }
}
