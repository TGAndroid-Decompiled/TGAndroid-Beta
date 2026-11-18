package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class z7 extends ym0 {
    public final g8 f42822n0;

    public z7(g8 g8Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var, false);
        this.f42822n0 = g8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f42822n0.B2 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
