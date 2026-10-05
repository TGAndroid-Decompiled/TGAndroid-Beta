package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class xu extends OrientationEventListener {
    public final zu f33090a;

    public xu(zu zuVar, Context context) {
        super(context);
        this.f33090a = zuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        zu zuVar = this.f33090a;
        aa1 aa1Var = zuVar.f33643c;
        if (zuVar.F != null && aa1Var.getVisibility() == 0 && (activity = zuVar.f33647r) != null && aa1Var.T && zuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                zuVar.N = true;
            } else if (zuVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(zuVar.L);
                    zuVar.M = false;
                    zuVar.N = false;
                }
            }
        }
    }
}
