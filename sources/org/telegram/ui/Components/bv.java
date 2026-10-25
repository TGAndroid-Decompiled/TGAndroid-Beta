package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class bv extends OrientationEventListener {
    public final dv f26966a;

    public bv(dv dvVar, Context context) {
        super(context);
        this.f26966a = dvVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        dv dvVar = this.f26966a;
        ma1 ma1Var = dvVar.f27606c;
        if (dvVar.F != null && ma1Var.getVisibility() == 0 && (activity = dvVar.f27609r) != null && ma1Var.T && dvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                dvVar.N = true;
            } else if (dvVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(dvVar.L);
                    dvVar.M = false;
                    dvVar.N = false;
                }
            }
        }
    }
}
