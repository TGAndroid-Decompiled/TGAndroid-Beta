package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class eu extends OrientationEventListener {
    public final gu f28119a;

    public eu(gu guVar, Context context) {
        super(context);
        this.f28119a = guVar;
    }

    @Override
    public final void onOrientationChanged(int i9) {
        Activity activity;
        gu guVar = this.f28119a;
        g81 g81Var = guVar.f28869c;
        if (guVar.B != null && g81Var.getVisibility() == 0 && (activity = guVar.f28873r) != null && g81Var.P && guVar.I) {
            if (i9 >= 240 && i9 <= 300) {
                guVar.J = true;
            } else if (guVar.J && i9 > 0) {
                if (i9 >= 330 || i9 <= 30) {
                    activity.setRequestedOrientation(guVar.H);
                    guVar.I = false;
                    guVar.J = false;
                }
            }
        }
    }
}
