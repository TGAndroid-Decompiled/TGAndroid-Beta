package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class tu extends OrientationEventListener {
    public final vu f28484a;

    public tu(vu vuVar, Context context) {
        super(context);
        this.f28484a = vuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        vu vuVar = this.f28484a;
        q91 q91Var = vuVar.f29760c;
        if (vuVar.F != null && q91Var.getVisibility() == 0 && (activity = vuVar.f29763r) != null && q91Var.T && vuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                vuVar.N = true;
            } else if (vuVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(vuVar.L);
                    vuVar.M = false;
                    vuVar.N = false;
                }
            }
        }
    }
}
