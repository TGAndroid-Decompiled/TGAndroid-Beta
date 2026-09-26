package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class gi extends org.telegram.ui.Components.uv {
    public final wn W;

    public gi(wn wnVar, org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, activity, d6Var, arrayList);
        this.W = wnVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        wn wnVar = this.W;
        wnVar.getClass();
        wnVar.g8(false, true, 0.0f);
    }
}
