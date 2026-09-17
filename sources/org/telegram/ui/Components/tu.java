package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class tu extends OrientationEventListener {
    public final vu f28206a;

    public tu(vu vuVar, Context context) {
        super(context);
        this.f28206a = vuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        vu vuVar = this.f28206a;
        d91 d91Var = vuVar.f29410c;
        if (vuVar.F != null && d91Var.getVisibility() == 0 && (activity = vuVar.f29413r) != null && d91Var.T && vuVar.M) {
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
