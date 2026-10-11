package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class gj extends org.telegram.ui.Components.jw {
    public final zn W;

    public gj(zn znVar, org.telegram.ui.ActionBar.m2 m2Var, Activity activity, org.telegram.ui.ActionBar.d6 d6Var, ArrayList arrayList) {
        super(m2Var, activity, d6Var, arrayList);
        this.W = znVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.W;
        znVar.getClass();
        znVar.j8(false, true, 0.0f);
    }
}
