package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class av extends OrientationEventListener {
    public final cv f24727a;

    public av(cv cvVar, Context context) {
        super(context);
        this.f24727a = cvVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        cv cvVar = this.f24727a;
        w91 w91Var = cvVar.f25264c;
        if (cvVar.F != null && w91Var.getVisibility() == 0 && (activity = cvVar.f25267r) != null && w91Var.T && cvVar.M) {
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
