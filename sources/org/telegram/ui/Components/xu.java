package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class xu extends OrientationEventListener {
    public final zu f32984a;

    public xu(zu zuVar, Context context) {
        super(context);
        this.f32984a = zuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        zu zuVar = this.f32984a;
        z91 z91Var = zuVar.f33646c;
        if (zuVar.F != null && z91Var.getVisibility() == 0 && (activity = zuVar.f33650r) != null && z91Var.T && zuVar.M) {
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
