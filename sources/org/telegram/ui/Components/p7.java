package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class p7 extends nn0 {
    public final w7 m0;

    public p7(w7 w7Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var, false);
        this.m0 = w7Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.f32081x2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
