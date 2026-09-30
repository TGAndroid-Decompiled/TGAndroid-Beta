package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class wu extends OrientationEventListener {
    public final yu f30057a;

    public wu(yu yuVar, Context context) {
        super(context);
        this.f30057a = yuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        yu yuVar = this.f30057a;
        r91 r91Var = yuVar.f30810c;
        if (yuVar.F != null && r91Var.getVisibility() == 0 && (activity = yuVar.f30813r) != null && r91Var.T && yuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                yuVar.N = true;
            } else if (yuVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(yuVar.L);
                    yuVar.M = false;
                    yuVar.N = false;
                }
            }
        }
    }
}
