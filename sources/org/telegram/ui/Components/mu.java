package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class mu extends OrientationEventListener {
    public final ou f27139a;

    public mu(ou ouVar, Context context) {
        super(context);
        this.f27139a = ouVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        ou ouVar = this.f27139a;
        e91 e91Var = ouVar.f27652c;
        if (ouVar.C != null && e91Var.getVisibility() == 0 && (activity = ouVar.f27655r) != null && e91Var.Q && ouVar.J) {
            if (i10 >= 240 && i10 <= 300) {
                ouVar.K = true;
            } else if (ouVar.K && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(ouVar.I);
                    ouVar.J = false;
                    ouVar.K = false;
                }
            }
        }
    }
}
