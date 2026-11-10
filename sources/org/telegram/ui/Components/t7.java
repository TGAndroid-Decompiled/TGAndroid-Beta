package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class t7 extends mm0 {
    public final a8 m0;

    public t7(a8 a8Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var, false);
        this.m0 = a8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.m0.A2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
