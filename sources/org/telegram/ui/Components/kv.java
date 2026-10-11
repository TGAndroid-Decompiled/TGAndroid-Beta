package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class kv extends OrientationEventListener {
    public final mv f28088a;

    public kv(mv mvVar, Context context) {
        super(context);
        this.f28088a = mvVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        mv mvVar = this.f28088a;
        ia1 ia1Var = mvVar.f28865c;
        if (mvVar.F != null && ia1Var.getVisibility() == 0 && (activity = mvVar.f28869r) != null && ia1Var.T && mvVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                mvVar.N = true;
            } else if (mvVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(mvVar.L);
                    mvVar.M = false;
                    mvVar.N = false;
                }
            }
        }
    }
}
