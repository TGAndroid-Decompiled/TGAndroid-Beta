package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class av extends OrientationEventListener {
    public final cv f24718a;

    public av(cv cvVar, Context context) {
        super(context);
        this.f24718a = cvVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        cv cvVar = this.f24718a;
        u91 u91Var = cvVar.f25372c;
        if (cvVar.F != null && u91Var.getVisibility() == 0 && (activity = cvVar.f25375r) != null && u91Var.T && cvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                cvVar.N = true;
            } else if (cvVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(cvVar.L);
                    cvVar.M = false;
                    cvVar.N = false;
                }
            }
        }
    }
}
