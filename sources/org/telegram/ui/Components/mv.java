package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class mv extends OrientationEventListener {
    public final ov f28654a;

    public mv(ov ovVar, Context context) {
        super(context);
        this.f28654a = ovVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        ov ovVar = this.f28654a;
        ma1 ma1Var = ovVar.f29300c;
        if (ovVar.F != null && ma1Var.getVisibility() == 0 && (activity = ovVar.f29304r) != null && ma1Var.T && ovVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                ovVar.N = true;
            } else if (ovVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(ovVar.L);
                    ovVar.M = false;
                    ovVar.N = false;
                }
            }
        }
    }
}
