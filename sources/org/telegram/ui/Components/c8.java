package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class c8 extends hp0 {
    public final k8 m0;

    public c8(k8 k8Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var, false);
        this.m0 = k8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.G0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
