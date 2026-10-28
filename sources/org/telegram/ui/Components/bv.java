package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class bv extends OrientationEventListener {
    public final dv f26918a;

    public bv(dv dvVar, Context context) {
        super(context);
        this.f26918a = dvVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        dv dvVar = this.f26918a;
        na1 na1Var = dvVar.f27551c;
        if (dvVar.F != null && na1Var.getVisibility() == 0 && (activity = dvVar.f27554r) != null && na1Var.T && dvVar.M) {
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
