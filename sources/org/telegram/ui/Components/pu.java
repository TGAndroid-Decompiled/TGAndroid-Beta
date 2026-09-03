package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class pu extends OrientationEventListener {
    public final ru f30188a;

    public pu(ru ruVar, Context context) {
        super(context);
        this.f30188a = ruVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        ru ruVar = this.f30188a;
        e91 e91Var = ruVar.f30895c;
        if (ruVar.C != null && e91Var.getVisibility() == 0 && (activity = ruVar.f30899r) != null && e91Var.Q && ruVar.J) {
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
