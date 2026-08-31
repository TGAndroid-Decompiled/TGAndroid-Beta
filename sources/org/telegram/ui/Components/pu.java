package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class pu extends OrientationEventListener {
    public final ru f30204a;

    public pu(ru ruVar, Context context) {
        super(context);
        this.f30204a = ruVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        ru ruVar = this.f30204a;
        f91 f91Var = ruVar.f30856c;
        if (ruVar.C != null && f91Var.getVisibility() == 0 && (activity = ruVar.f30860r) != null && f91Var.Q && ruVar.J) {
            if (i10 >= 240 && i10 <= 300) {
                ruVar.K = true;
            } else if (ruVar.K && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(ruVar.I);
                    ruVar.J = false;
                    ruVar.K = false;
                }
            }
        }
    }
}
