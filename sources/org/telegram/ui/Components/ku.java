package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class ku extends OrientationEventListener {
    public final mu f30149a;

    public ku(mu muVar, Context context) {
        super(context);
        this.f30149a = muVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        mu muVar = this.f30149a;
        s81 s81Var = muVar.f30765c;
        if (muVar.B != null && s81Var.getVisibility() == 0 && (activity = muVar.f30769r) != null && s81Var.P && muVar.I) {
            if (i10 >= 240 && i10 <= 300) {
                muVar.J = true;
            } else if (muVar.J && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(muVar.H);
                    muVar.I = false;
                    muVar.J = false;
                }
            }
        }
    }
}
