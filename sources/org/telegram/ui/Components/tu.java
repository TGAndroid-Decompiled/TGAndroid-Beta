package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class tu extends OrientationEventListener {
    public final vu f28184a;

    public tu(vu vuVar, Context context) {
        super(context);
        this.f28184a = vuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        vu vuVar = this.f28184a;
        c91 c91Var = vuVar.f29428c;
        if (vuVar.F != null && c91Var.getVisibility() == 0 && (activity = vuVar.f29431r) != null && c91Var.T && vuVar.M) {
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
