package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class di extends org.telegram.ui.Components.tv {
    public final ei W;

    public di(ei eiVar, org.telegram.ui.ActionBar.n2 n2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(n2Var, activity, d6Var, arrayList);
        this.W = eiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        xn xnVar = this.W.f32938p;
        xnVar.getClass();
        xnVar.g8(false, true, 0.0f);
    }
}
