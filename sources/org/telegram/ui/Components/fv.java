package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class fv extends OrientationEventListener {
    public final hv f24817a;

    public fv(hv hvVar, Context context) {
        super(context);
        this.f24817a = hvVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        hv hvVar = this.f24817a;
        da1 da1Var = hvVar.f25406c;
        if (hvVar.F != null && da1Var.getVisibility() == 0 && (activity = hvVar.f25409r) != null && da1Var.T && hvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                hvVar.N = true;
            } else if (hvVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(hvVar.L);
                    hvVar.M = false;
                    hvVar.N = false;
                }
            }
        }
    }
}
