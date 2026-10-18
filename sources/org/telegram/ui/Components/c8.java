package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class c8 extends cp0 {
    public final k8 f25137l0;

    public c8(k8 k8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.f25137l0 = k8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f25137l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
