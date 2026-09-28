package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class vu extends OrientationEventListener {
    public final xu f29735a;

    public vu(xu xuVar, Context context) {
        super(context);
        this.f29735a = xuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        xu xuVar = this.f29735a;
        q91 q91Var = xuVar.f30481c;
        if (xuVar.F != null && q91Var.getVisibility() == 0 && (activity = xuVar.f30484r) != null && q91Var.T && xuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                xuVar.N = true;
            } else if (xuVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(xuVar.L);
                    xuVar.M = false;
                    xuVar.N = false;
                }
            }
        }
    }
}
