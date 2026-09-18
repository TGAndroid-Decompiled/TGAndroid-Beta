package org.telegram.ui.Components;

import android.content.Context;
import android.view.MotionEvent;
public final class b8 extends to0 {
    public final j8 f22877l0;

    public b8(j8 j8Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var, false);
        this.f22877l0 = j8Var;
    }

    @Override
    public final boolean d(MotionEvent motionEvent) {
        if (this.f22877l0.H0 != 0) {
            return false;
        }
        return super.d(motionEvent);
    }
}
