package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
public final class ru extends OrientationEventListener {
    public final tu f30116a;

    public ru(tu tuVar, Context context) {
        super(context);
        this.f30116a = tuVar;
    }

    @Override
    public final void onOrientationChanged(int i10) {
        Activity activity;
        tu tuVar = this.f30116a;
        b91 b91Var = tuVar.f30735c;
        if (tuVar.F != null && b91Var.getVisibility() == 0 && (activity = tuVar.f30739r) != null && b91Var.T && tuVar.M) {
            if (i10 >= 240 && i10 <= 300) {
                tuVar.N = true;
            } else if (tuVar.N && i10 > 0) {
                if (i10 >= 330 || i10 <= 30) {
                    activity.setRequestedOrientation(tuVar.L);
                    tuVar.M = false;
                    tuVar.N = false;
                }
            }
        }
    }
}
