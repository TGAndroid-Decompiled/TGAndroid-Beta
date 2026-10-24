package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class yu extends OrientationEventListener {
    public final av f33047a;

    public yu(av avVar, Context context) {
        super(context);
        this.f33047a = avVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        av avVar = this.f33047a;
        da1 da1Var = avVar.f24811c;
        if (avVar.F != null && da1Var.getVisibility() == 0 && (activity = avVar.f24814r) != null && da1Var.T && avVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                avVar.N = true;
            } else if (avVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(avVar.L);
                    avVar.M = false;
                    avVar.N = false;
                }
            }
        }
    }
}
