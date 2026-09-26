package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class uu extends OrientationEventListener {
    public final wu f28920a;

    public uu(wu wuVar, Context context) {
        super(context);
        this.f28920a = wuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        wu wuVar = this.f28920a;
        o91 o91Var = wuVar.f30184c;
        if (wuVar.F != null && o91Var.getVisibility() == 0 && (activity = wuVar.f30187r) != null && o91Var.T && wuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                wuVar.N = true;
            } else if (wuVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(wuVar.L);
                    wuVar.M = false;
                    wuVar.N = false;
                }
            }
        }
    }
}
