package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class jv extends OrientationEventListener {
    public final lv f27785a;

    public jv(lv lvVar, Context context) {
        super(context);
        this.f27785a = lvVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        lv lvVar = this.f27785a;
        ha1 ha1Var = lvVar.f28599c;
        if (lvVar.F != null && ha1Var.getVisibility() == 0 && (activity = lvVar.f28603r) != null && ha1Var.T && lvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                lvVar.N = true;
            } else if (lvVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(lvVar.L);
                    lvVar.M = false;
                    lvVar.N = false;
                }
            }
        }
    }
}
