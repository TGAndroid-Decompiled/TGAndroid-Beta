package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class kv extends OrientationEventListener {
    public final mv f28141a;

    public kv(mv mvVar, Context context) {
        super(context);
        this.f28141a = mvVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        mv mvVar = this.f28141a;
        ha1 ha1Var = mvVar.f28943c;
        if (mvVar.F != null && ha1Var.getVisibility() == 0 && (activity = mvVar.f28947r) != null && ha1Var.T && mvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                mvVar.N = true;
            } else if (mvVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(mvVar.L);
                    mvVar.M = false;
                    mvVar.N = false;
                }
            }
        }
    }
}
