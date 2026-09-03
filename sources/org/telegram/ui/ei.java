package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ei extends org.telegram.ui.Components.lv {
    public final fi T;

    public ei(fi fiVar, org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, activity, f6Var, arrayList);
        this.T = fiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zn znVar = this.T.f34095p;
        znVar.getClass();
        znVar.g8(false, true, 0.0f);
    }
}
