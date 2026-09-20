package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class tu extends OrientationEventListener {
    public final vu f28442a;

    public tu(vu vuVar, Context context) {
        super(context);
        this.f28442a = vuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        vu vuVar = this.f28442a;
        p91 p91Var = vuVar.f29830c;
        if (vuVar.F != null && p91Var.getVisibility() == 0 && (activity = vuVar.f29833r) != null && p91Var.T && vuVar.M) {
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
