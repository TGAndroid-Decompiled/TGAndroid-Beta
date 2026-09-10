package org.telegram.ui;

import android.app.Activity;
import java.util.ArrayList;
public final class ii extends org.telegram.ui.Components.wv {
    public final ji W;

    public ii(ji jiVar, org.telegram.ui.ActionBar.p2 p2Var, Activity activity, org.telegram.ui.ActionBar.f6 f6Var, ArrayList arrayList) {
        super(p2Var, activity, f6Var, arrayList);
        this.W = jiVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        eo eoVar = this.W.f34117p;
        eoVar.getClass();
        eoVar.g8(false, true, 0.0f);
    }
}
