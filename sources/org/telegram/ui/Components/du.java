package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;

public final class du extends OrientationEventListener {

    public final fu f27841a;

    public du(fu fuVar, Context context) {
        super(context);
        this.f27841a = fuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        fu fuVar = this.f27841a;
        i81 i81Var = fuVar.f28451c;
        if (fuVar.B != null && i81Var.getVisibility() == 0 && (activity = fuVar.f28455r) != null && i81Var.P && fuVar.I) {
            if (i10 >= 240 && i10 <= 300) {
                fuVar.J = true;
                return;
            }
            if (!fuVar.J || i10 <= 0) {
                return;
            }
            if (i10 >= 330 || i10 <= 30) {
                activity.setRequestedOrientation(fuVar.H);
                fuVar.I = false;
                fuVar.J = false;
            }
        }
    }
}
