package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class uu extends OrientationEventListener {
    public final wu f28561a;

    public uu(wu wuVar, Context context) {
        super(context);
        this.f28561a = wuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        wu wuVar = this.f28561a;
        b91 b91Var = wuVar.f29811c;
        if (wuVar.F != null && b91Var.getVisibility() == 0 && (activity = wuVar.f29814r) != null && b91Var.T && wuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                wuVar.N = true;
            } else if (wuVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(wuVar.L);
                    wuVar.M = false;
                    wuVar.N = false;
                }
            }
        }
    }
}
