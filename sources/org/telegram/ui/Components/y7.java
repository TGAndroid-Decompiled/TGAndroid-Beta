package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class y7 extends ao0 {
    public final g8 f34935h0;

    public y7(g8 g8Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, c6Var, false);
        this.f34935h0 = g8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f34935h0.D0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
