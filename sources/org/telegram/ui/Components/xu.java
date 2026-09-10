package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class xu extends OrientationEventListener {
    public final zu f29155a;

    public xu(zu zuVar, Context context) {
        super(context);
        this.f29155a = zuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        zu zuVar = this.f29155a;
        o91 o91Var = zuVar.f29811c;
        if (zuVar.F != null && o91Var.getVisibility() == 0 && (activity = zuVar.f29814r) != null && o91Var.T && zuVar.M) {
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
