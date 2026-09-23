package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class b8 extends fo0 {
    public final j8 f22597l0;

    public b8(j8 j8Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var, false);
        this.f22597l0 = j8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f22597l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
