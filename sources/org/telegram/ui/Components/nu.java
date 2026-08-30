package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class nu extends OrientationEventListener {
    public final pu f27363a;

    public nu(pu puVar, Context context) {
        super(context);
        this.f27363a = puVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        pu puVar = this.f27363a;
        e91 e91Var = puVar.f27985c;
        if (puVar.C != null && e91Var.getVisibility() == 0 && (activity = puVar.f27988r) != null && e91Var.Q && puVar.J) {
            if (i10 >= 240 && i10 <= 300) {
                puVar.K = true;
            } else if (puVar.K && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(puVar.I);
                    puVar.J = false;
                    puVar.K = false;
                }
            }
        }
    }
}
